const express = require("express");
const router = express.Router();
const listing = require("../models/listing");
const { listingSchema } = require("../schema.js");
const ExpressError = require("../utils/ExressError");
const wrapAsync = require("../utils/wrapAsync");
const { isLoggedIn, isOwner, validateListingMiddleware } = require("../middleware.js");



//Index route
router.get("/", async (req, res) => {
  const allListings = await listing.find({});
  res.render("listings/index", { allListings });
});

// New Route
router.get("/new", isLoggedIn,  (req, res) => {
  res.render("listings/new", { errors: [], listing: {} });
});

//Show Route
router.get("/:id", async (req, res) => {
  const { id } = req.params;
  if (id === "new") {
    return res.redirect("/listings/new");
  }

  const foundListing = await listing.findById(id).populate({path:"reviews", populate:{path:"author"}}).populate("owner");
  if (!foundListing) {
    req.flash("error", "Listing not found");
    return res.redirect("/listings");
  }
  console.log(listing);
  res.render("listings/show", {
    foundListing,
    successMessage: req.query.success || "",
  });
});

//create route
router.post(
  "/", isLoggedIn,
  wrapAsync(async (req, res, next) => {
    let result = listingSchema.validate(req.body, { abortEarly: false });
    console.log(result.error);
    if (result.error) {
      throw new ExpressError(
        result.error.details.map((err) => err.message).join(", "),
        400,
      );
    }
    const newListing = new listing(req.body);
    newListing.owner= req.user._id;
    await newListing.save();
    req.flash("success", "Listing created successfully");
    res.redirect(
      `/listings/${newListing._id}?success=Listing created successfully`,
    );
  }),
);

//Edit route
router.get("/:id/edit", isLoggedIn, isOwner, async (req, res) => {
  const { id } = req.params;
  const foundListing = await listing.findById(id);
  if (!foundListing) {
    req.flash("error", "Listing not found");
    return res.redirect("/listings");
  }
  if (!foundListing.owner || !foundListing.owner.equals(req.user._id)) {
    req.flash("error", "You don't have permission to edit this listing");
    return res.redirect(`/listings/${id}`);
  }
  res.render("listings/edit", { foundListing, errors: [] });
});

//Update route
router.put(
  "/:id", isLoggedIn, isOwner, validateListingMiddleware,
  wrapAsync(async (req, res) => {
    const { id } = req.params;
    const result = listingSchema.validate(req.body, { abortEarly: false });

    if (result.error) {
      const validationErrors = result.error.details.map((err) => err.message);
      return res.status(400).render("listings/edit", {
        foundListing: { ...req.body, _id: id },
        errors: validationErrors,
      });
    }
    
   const existingListing = await listing.findById(id);
   if (!existingListing) {
     req.flash("error", "Listing not found");
     return res.redirect("/listings");
   }
  if (!existingListing.owner || !existingListing.owner.equals(req.user._id)) {
     req.flash("error", "you don't have permission to edit");
     return res.redirect(`/listings/${id}`);
   }
    const updatedListing = await listing.findByIdAndUpdate(id, req.body, {
      new: true,
    });
    req.flash("success", "Listing updated successfully");
    res.redirect(
      `/listings/${updatedListing._id}?success=Listing updated successfully`,
    );
  }),
);

//Delete route
router.delete("/:id", isLoggedIn, isOwner, wrapAsync(async (req, res) => {
  const { id } = req.params;
  const existingListing = await listing.findById(id);
  if (!existingListing) {
    req.flash("error", "Listing not found");
    return res.redirect("/listings");
  }
  if (!existingListing.owner || !existingListing.owner.equals(req.user._id)) {
    req.flash("error", "You don't have permission to delete this listing");
    return res.redirect(`/listings/${id}`);
  }
  await listing.findByIdAndDelete(id);
  req.flash("success", "Listing deleted successfully");
  res.redirect("/listings");
}));

module.exports = router;
