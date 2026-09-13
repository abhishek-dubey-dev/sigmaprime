const Listing = require("../models/listing");
const { listingSchema } = require("../schema.js");
const ExpressError = require("../utils/ExressError");

module.exports.index =async (req, res) => {
  const allListings = await Listing.find({});
  res.render("listings/index", { allListings });
}


module.exports.renderNewForm=(req, res) => {
  res.render("listings/new", { errors: [], listing: {} });
}


module.exports.showListing= async (req, res) => {
  const { id } = req.params;
  if (id === "new") {
    return res.redirect("/listings/new");
  }

  const foundListing = await Listing.findById(id).populate({path:"reviews", populate:{path:"author"}}).populate("owner");
  if (!foundListing) {
    req.flash("error", "Listing not found");
    return res.redirect("/listings");
  }
  res.render("listings/show", {
    foundListing,
    successMessage: req.query.success || "",
  });
}


module.exports.createListing=async (req, res, next) => {
    let result = listingSchema.validate(req.body, { abortEarly: false });
    console.log(result.error);
    if (result.error) {
      throw new ExpressError(
        result.error.details.map((err) => err.message).join(", "),
        400,
      );
    }
    const newListing = new Listing(req.body);
    newListing.owner= req.user._id;
    await newListing.save();
    req.flash("success", "Listing created successfully");
    res.redirect(
      `/listings/${newListing._id}?success=Listing created successfully`,
    );
  }


  module.exports.editListing=async (req, res) => {
    const { id } = req.params;
    const foundListing = await Listing.findById(id);
    if (!foundListing) {
      req.flash("error", "Listing not found");
      return res.redirect("/listings");
    }
    if (!foundListing.owner || !foundListing.owner.equals(req.user._id)) {
      req.flash("error", "You don't have permission to edit this listing");
      return res.redirect(`/listings/${id}`);
    }
    res.render("listings/edit", { foundListing, errors: [] });
}


module.exports.updateListing=async (req, res) => {
    const { id } = req.params;
    const result = listingSchema.validate(req.body, { abortEarly: false });

    if (result.error) {
      const validationErrors = result.error.details.map((err) => err.message);
      return res.status(400).render("listings/edit", {
        foundListing: { ...req.body, _id: id },
        errors: validationErrors,
      });
    }
    
  const existingListing = await Listing.findById(id);
   if (!existingListing) {
     req.flash("error", "Listing not found");
     return res.redirect("/listings");
   }
  if (!existingListing.owner || !existingListing.owner.equals(req.user._id)) {
     req.flash("error", "you don't have permission to edit");
     return res.redirect(`/listings/${id}`);
   }
    const updatedListing = await Listing.findByIdAndUpdate(id, req.body, {
      new: true,
    });
    req.flash("success", "Listing updated successfully");
    res.redirect(
      `/listings/${updatedListing._id}?success=Listing updated successfully`,
    );
}


module.exports.destroyListing=async (req, res) => {
  const { id } = req.params;
  const existingListing = await Listing.findById(id);
  if (!existingListing) {
    req.flash("error", "Listing not found");
    return res.redirect("/listings");
  }
  if (!existingListing.owner || !existingListing.owner.equals(req.user._id)) {
    req.flash("error", "You don't have permission to delete this listing");
    return res.redirect(`/listings/${id}`);
  }
  await Listing.findByIdAndDelete(id);
  req.flash("success", "Listing deleted successfully");
  res.redirect("/listings");
}