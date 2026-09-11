const express = require("express");
const router = express.Router();
const User = require("../models/user");
const passport = require("passport");
const wrapAsync = require("../utils/wrapAsync");
const { saveRedirectUrl } = require("../middleware");

router.get("/signup", (req, res) => {
  res.render("users/signup.ejs");
});

router.post(
  "/signup",
  saveRedirectUrl,
  wrapAsync(async (req, res) => {
    const { username, email, password } = req.body;
    const newUser = new User({ email, username });
    const registeredUser = await User.register(newUser, password);
    console.log(registeredUser);
    req.login(registeredUser, (err) => {
      if (err) {
        return res.status(500).send("Unable to log in after signup");
      }
      req.flash("success", "Welcome to WanderLust!");
      const redirectUrl = res.locals.redirectUrl || "/listings";
      delete req.session.redirectUrl;
      res.redirect(redirectUrl);
    });
  }),
);
router.get("/login", (req, res) => {
  res.render("users/login.ejs");
});

router.post(
  "/login", saveRedirectUrl,
  passport.authenticate("local", {
    failureRedirect: "/login",
    failureFlash: true,
  }),
  (req, res) => {
    req.flash("success", "Welcome back to WanderLust!");
    const redirectUrl = res.locals.redirectUrl || "/listings";
    delete req.session.redirectUrl;
    res.redirect(redirectUrl);
  },
);

router.get("/logout", (req, res, next) => {
  req.logout((err) => {
    if (err) {
      return next(err);
    }
    req.flash("success", "you are logged out!");
    res.redirect("/listings");
  });
});

module.exports = router;
