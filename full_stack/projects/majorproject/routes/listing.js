const express = require("express");
const router = express.Router();
const listing = require("../models/listing");
const { listingSchema } = require("../schema.js");
const ExpressError = require("../utils/ExressError");
const wrapAsync = require("../utils/wrapAsync");
const { isLoggedIn, isOwner, validateListingMiddleware } = require("../middleware.js");

const listingController=require("../controllers/listings.js");

router.route("/")
.get(wrapAsync(listingController.index))
.post(isLoggedIn,
  wrapAsync(listingController.createListing)
);

// New Route
router.get("/new", isLoggedIn, listingController.renderNewForm) ;

router.route("/:id")
.get(wrapAsync(listingController.showListing))
.put(isLoggedIn, isOwner, validateListingMiddleware,
  wrapAsync(listingController.updateListing))
.delete(isLoggedIn, isOwner, wrapAsync(listingController.destroyListing));








//Edit route
router.get("/:id/edit", isLoggedIn, isOwner, wrapAsync(listingController.editListing));



module.exports = router;
