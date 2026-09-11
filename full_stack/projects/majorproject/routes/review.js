const express= require("express");
const router = express.Router({ mergeParams: true });
const wrapAsync = require("../utils/wrapAsync");
const ExpressError = require("../utils/ExressError");

const Review = require("../models/review");
const listing = require("../models/listing");
const { isLoggedIn, validateReviewMiddleware } = require("../middleware.js");



//Review route
//POST route
router.post(
  "/",
  isLoggedIn,
  validateReviewMiddleware,
  wrapAsync(async (req, res) => {
    const { id } = req.params;
    const { rating, comment } = req.body.review;
    const foundListing = await listing.findById(id);

    if (!foundListing) {
      return res.status(404).send("Listing not found");
    }

    const newReview = new Review({ comment, rating, author: req.user._id });
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
  isLoggedIn,
  wrapAsync(async (req, res) => {
    let { id, reviewId } = req.params;
    const foundListing = await listing.findById(id);
    if (!foundListing) {
      req.flash("error", "Listing not found");
      return res.redirect("/listings");
    }
    if (!foundListing.owner || !foundListing.owner.equals(req.user._id)) {
      req.flash("error", "You don't have permission to delete this review");
      return res.redirect(`/listings/${id}`);
    }
    await listing.findByIdAndUpdate(id, { $pull: { reviews: reviewId } });
    await Review.findByIdAndDelete(reviewId);
    req.flash("success", "Review deleted successfully");
    res.redirect(`/listings/${id}?success=Review deleted successfully`);
  }),
);

module.exports = router;