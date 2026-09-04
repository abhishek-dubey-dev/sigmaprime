const express= require("express");
const router = express.Router({ mergeParams: true });
const wrapAsync = require("../utils/wrapAsync");
const ExpressError = require("../utils/ExressError");
const { reviewSchema } = require("../schema.js");
const Review = require("../models/review");
const listing = require("../models/listing");

const validateReviewMiddleware = (req, res, next) => {
  let { error } = reviewSchema.validate(req.body, { abortEarly: false });
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

//Review route
//POST route
router.post(
  "/",
  validateReviewMiddleware,
  wrapAsync(async (req, res) => {
    const { id } = req.params;
    const { rating, comment } = req.body.review;
    const foundListing = await listing.findById(id);

    if (!foundListing) {
      return res.status(404).send("Listing not found");
    }

    const newReview = new Review({ comment, rating });
    await newReview.save();
    foundListing.reviews.push(newReview);
    await foundListing.save();
    req.flash("success", "Review added successfully");
    res.redirect(`/listings/${id}?success=Review added successfully`);
  }),
);

//DELETE Review route
router.delete(
  "/:reviewId",
  wrapAsync(async (req, res) => {
    let { id, reviewId } = req.params;
    listing.findByIdAndUpdate(id, { $pull: { reviews: reviewId } });
    await Review.findByIdAndDelete(reviewId);
    await listing.findById(id);
    req.flash("success", "Review deleted successfully");
    res.redirect(`/listings/${id}?success=Review deleted successfully`);
  }),
);

module.exports = router;