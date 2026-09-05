const express = require("express");
const app = express();
const mongoose = require("mongoose");
const listing = require("./models/listing.js");
const path = require("path");
const methodOverride = require("method-override");
const ejsMate = require("ejs-mate");
const wrapAsync = require("./utils/wrapAsync");
const ExpressError = require("./utils/ExressError");
const { listingSchema, reviewSchema } = require("./schema.js");
const Review = require("./models/review.js");
const session = require("express-session");
const flash = require("connect-flash");
const passport = require("passport");
const LocalStrategy = require("passport-local");
const User = require("./models/user.js");

const listingsRouter = require("./routes/listing.js");
const reviewsRouter = require("./routes/review.js");
const userRouter = require("./routes/user.js");

app.set("view engine", "ejs");
app.set("views", path.join(__dirname, "views"));
app.use(express.urlencoded({ extended: true }));
app.use(methodOverride("_method"));
app.engine("ejs", ejsMate);
app.use(express.static(path.join(__dirname, "public")));

const MONGO_URL = "mongodb://localhost:27017/mydatabase";

/* function validateListing(data) {
  const errors = [];

  if (!data.title || data.title.trim() === "") {
    errors.push("Title is required.");
  }

  if (!data.description || data.description.trim() === "") {
    errors.push("Description is required.");
  }

  if (!data.price || "Number(data.price) <= 0) {
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
} */

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

const sessionOptions = {
  secret: "mysupersecretecode",
  resave: false,
  saveUninitialized: true,
  cookie: {
    expires: Date.now() + 1000 * 60 * 60 * 24 * 7, // 1 week
    maxAge: 1000 * 60 * 60 * 24 * 7, // 1 week
    httpOnly: true,
  },
};

app.use(session(sessionOptions));
app.use(flash());

app.use(passport.initialize());
app.use(passport.session());
passport.use(new LocalStrategy(User.authenticate()));

passport.serializeUser(User.serializeUser());
passport.deserializeUser(User.deserializeUser());

app.get("/", (req, res) => {
  res.send("Hello World");
});

app.use((req, res, next) => {
  res.locals.success = req.flash("success");
  res.locals.error = req.flash("error");
  next();
});

// app.get("/demouser", async (req, res) => {
 // let fakeUser = new User({
 //   email: "student@gmail.com",
//    username: "delta-student",
//  });

 // let registeredUser = await User.register(fakeUser, "helloworld");
 // res.send(registeredUser);
 //}); 

app.use("/listings", listingsRouter);

app.use("/listings/:id/reviews", reviewsRouter);

app.use("/", userRouter);

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
