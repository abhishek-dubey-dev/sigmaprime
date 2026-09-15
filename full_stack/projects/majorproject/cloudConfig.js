require("dotenv").config();

const cloudinary = require("cloudinary").v2;
const { CloudinaryStorage } = require("multer-storage-cloudinary");

const cloudName = process.env.CLOUD_NAME || process.env.CLOUDINARY_CLOUD_NAME;
const apiKey = process.env.CLOUD_API_KEY || process.env.CLOUDINARY_API_KEY;
const apiSecret = process.env.CLOUD_API_SECRET || process.env.CLOUDINARY_API_SECRET;

const missingVariables = [
  ["CLOUD_NAME/CLOUDINARY_CLOUD_NAME", cloudName],
  ["CLOUD_API_KEY/CLOUDINARY_API_KEY", apiKey],
  ["CLOUD_API_SECRET/CLOUDINARY_API_SECRET", apiSecret],
].filter(([, value]) => !value)
  .map(([name]) => name);

if (missingVariables.length) {
  throw new Error(`Missing Cloudinary environment variables: ${missingVariables.join(", ")}`);
}

cloudinary.config({
  cloud_name: cloudName,
  api_key: apiKey,
  api_secret: apiSecret,
});


const storage = new CloudinaryStorage({
  cloudinary: cloudinary,
  params: {
    folder: "wanderlust_DEV",
    allowed_formats: ["png", "jpg", "jpeg"],
  },
});

module.exports = {
    cloudinary,
    storage,
};