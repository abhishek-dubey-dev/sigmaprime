const express = require("express");
const router = express.Router();
const listing = require("../models/listing");
const { listingSchema } = require("../schema.js");
const ExpressError = require("../utils/ExressError");
const wrapAsync = require("../utils/wrapAsync");

const validateListingMiddleware = (req, res, next) => {
  let { error } = listingSchema.validate(req.body, { abortEarly: false });
  if (error) {
    let errorMessages = error.details.map((err) => err.message).join(", ");
    throw new ExpressError(
      error.details.map((err) => err.message).join(", "),
      400,
    );
  } else {
    next();
  }
};

//Index route
router.get("/", async (req, res) => {
  const allListings = await listing.find({});
  res.render("listings/index", { allListings });
});

// New Route
router.get("/new", (req, res) => {
  res.render("listings/new", { errors: [], listing: {} });
});

//Show Route
router.get("/:id", async (req, res) => {
  const { id } = req.params;
  if (id === "new") {
    return res.redirect("/listings/new");
  }

  const foundListing = await listing.findById(id).populate("reviews");
  if (!foundListing) {
    req.flash("error", "Listing not found");
    return res.redirect("/listings");
  }
  res.render("listings/show", {
    foundListing,
    successMessage: req.query.success || "",
  });
});

//create route
router.post(
  "/",
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
    await newListing.save();
    req.flash("success", "Listing created successfully");
    res.redirect(
      `/listings/${newListing._id}?success=Listing created successfully`,
    );
  }),
);

//Edit route
router.get("/:id/edit", async (req, res) => {
  const { id } = req.params;
  const foundListing = await listing.findById(id);
    if (!foundListing) {
    req.flash("error", "Listing not found");
    return res.redirect("/listings");
  } 
  res.render("listings/edit", { foundListing, errors: [] });
});

//Update route
router.put("/:id", wrapAsync(async (req, res) => {
  const { id } = req.params;
  const result = listingSchema.validate(req.body, { abortEarly: false });

  if (result.error) {
    const validationErrors = result.error.details.map((err) => err.message);
    return res.status(400).render("listings/edit", {
      foundListing: { ...req.body, _id: id },
      errors: validationErrors,
    });
  }

  const updatedListing = await listing.findByIdAndUpdate(id, req.body, {
    new: true,
  });
  req.flash("success", "Listing updated successfully");
  res.redirect(
    `/listings/${updatedListing._id}?success=Listing updated successfully`,
  );
}));

//Delete route
router.delete("/:id", async (req, res) => {
  const { id } = req.params;
  await listing.findByIdAndDelete(id);
  req.flash("success", "Listing deleted successfully");
  res.redirect("/listings");
});


module.exports = router;