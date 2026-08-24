const express = require("express");
const app = express();
const mongoose = require("mongoose");
const listing = require("./models/listing.js");
const path= require("path");

const MONGO_URL = "mongodb://localhost:27017/mydatabase";

main()
  .then(() => {
    console.log("Database connection established");
  })
  .catch((err) => {
    console.error("Database connection error:", err);
  });

async function main() {
  await mongoose.connect(MONGO_URL);
  console.log("Connected to MongoDB");
}

app.get("/", (req, res) => {
  res.send("Hello World");
});

//Index route
app.get("/listings", async (req, res) => {
const allListings = await listing.find({});
  res.render("listings/index", { allListings });
});

//Show Route
app.get("/listings/:id", async (req, res) => {
  const { id } = req.params;
  const foundListing = await listing.findById(id);
  res.render("listings/show", { foundListing });
});

//Create New Route
app.get("/listings/new", (req, res) => {
  res.render("listings/new");
});

app.listen(8080, () => {
  console.log("Server is running on port 8080");
});
