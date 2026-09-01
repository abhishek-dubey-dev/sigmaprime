const express = require("express");
const app = express();
const mongoose = require("mongoose");
const listing = require("./models/listing.js");
const path = require("path");
const methodOverride = require("method-override");
const ejsMate = require("ejs-mate");
const wrapAsync = require("./utils/wrapAsync");
const ExpressError = require("./utils/ExressError");
const { listingSchema } = require("./schema.js");

app.set("view engine", "ejs");
app.set("views", path.join(__dirname, "views"));
app.use(express.urlencoded({ extended: true }));
app.use(methodOverride("_method"));
app.engine("ejs", ejsMate);
app.use(express.static(path.join(__dirname, "public")));

const MONGO_URL = "mongodb://localhost:27017/mydatabase";

function validateListing(data) {
  const errors = [];

  if (!data.title || data.title.trim() === "") {
    errors.push("Title is required.");
  }

  if (!data.description || data.description.trim() === "") {
    errors.push("Description is required.");
  }

  if (!data.price || Number(data.price) <= 0) {
    errors.push("Price must be greater than 0.");
  }

  if (!data.location || data.location.trim() === "") {
    errors.push("Location is required.");
  }

  if (!data.country || data.country.trim() === "") {
    errors.push("Country is required.");
  }

  if (
    !data.image ||
    (typeof data.image === "string" && data.image.trim() === "")
  ) {
    errors.push("Image URL is required.");
  }

  return errors;
}

main()
  .then(() => {
    app.listen(8080, () => {
      console.log("Server is running on port 8080");
    });
  })
  .catch((err) => {
    console.error("Database connection error:", err);
    process.exit(1);
  });

async function main() {
  await mongoose.connect(MONGO_URL);
  console.log("Connected to MongoDB");
}

app.get("/", (req, res) => {
  res.send("Hello World");
});

const validateListingMiddleware = (req, res, next) => {
  let {error} = listingSchema.validate(req.body, { abortEarly: false });
  if (error) {
    let errorMessages = error.details.map((err) => err.message).join(", ");
  throw new ExpressError(error.details.map((err) => err.message).join(", "), 400);
  }
  else {
    next();
  }
};

//Index route
app.get("/listings", async (req, res) => {
  const allListings = await listing.find({});
  res.render("listings/index", { allListings });
});

// New Route
app.get("/listings/new", (req, res) => {
  res.render("listings/new", { errors: [], listing: {} });
});

//Show Route
app.get("/listings/:id", async (req, res) => {
  const { id } = req.params;
  if (id === "new") {
    return res.redirect("/listings/new");
  }

  const foundListing = await listing.findById(id);
  res.render("listings/show", {
    foundListing,
    successMessage: req.query.success || "",
  });
});

//create route
app.post(
  "/listings",
  wrapAsync(async (req, res, next) => {
   let result= listingSchema.validate(req.body, { abortEarly: false });
   console.log(result.error);
    if (result.error) {
      throw new ExpressError(result.error.details.map((err) => err.message).join(", "), 400);
    }
    const newListing = new listing(req.body);
    await newListing.save();
    res.redirect(
      `/listings/${newListing._id}?success=Listing created successfully`,
    );
  }),
);

//Edit route
app.get("/listings/:id/edit", async (req, res) => {
  const { id } = req.params;
  const foundListing = await listing.findById(id);
  res.render("listings/edit", { foundListing, errors: [] });
});

//Update route
app.put("/listings/:id", async (req, res) => {
  const { id } = req.params;
  const validationErrors = validateListing(req.body);

  if (validationErrors.length > 0) {
    return res.status(400).render("listings/edit", {
      foundListing: { ...req.body, _id: id },
      errors: validationErrors,
    });
  }

  const updatedListing = await listing.findByIdAndUpdate(id, req.body, {
    new: true,
  });
  res.redirect(
    `/listings/${updatedListing._id}?success=Listing updated successfully`,
  );
});

//Delete route
app.delete("/listings/:id", async (req, res) => {
  const { id } = req.params;
  await listing.findByIdAndDelete(id);
  res.redirect("/listings");
});

// Catch-all route for undefined routes
app.use((req, res, next) => {
  next(new ExpressError("Page Not Found", 404));
});

// Error handling middleware
app.use((err, req, res, next) => {
  let { statusCode = 500, message = "Internal Server Error" } = err;
  if (err instanceof ExpressError) {
    statusCode = err.statusCode;
    message = err.message;
  }
  res.status(statusCode).render("error", { message, statusCode });
});
