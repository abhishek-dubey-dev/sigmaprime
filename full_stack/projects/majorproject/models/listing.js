const mongoose = require("mongoose");
const Schema = mongoose.Schema;
const Review = require("./review.js");

const listingSchema = new Schema({
  title: { type: String, required: true },
  description: { type: String, required: true },
  image: {
    type: Schema.Types.Mixed,
    required: true,
    set: (value) =>
      value && typeof value === "string" && value.trim() === ""
        ? "default-image.jpg"
        : value,
  },
  price: { type: Number, required: true },
  location: { type: String, required: true },
  country: { type: String, required: true },
  reviews: [{ type: Schema.Types.ObjectId, ref: "Review" }],


});

listingSchema.post("findOneAndDelete", async function (listing) {
  if (listing) {
    await mongoose.model("Review").deleteMany({
      _id: { $in: listing.reviews }
    });
  }
});

const Listing = mongoose.model("Listing", listingSchema);
module.exports = Listing;
