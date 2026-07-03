//Creating an object using object literal

const student = {
  name: "abhishek",
  age: 28,
  marks: 94.4,
  city: "jabalpur",
};

let delhi = {
  latitude: "28.7041 N",
  longitude: "77.1025 E",
};

const item = {
  price: 100.99,
  discount: 50,
  color: ["red", "blue", "green"],
};

//Creating a thread/ twitter post using object literal

const post = {
  username: "@abhishek",
  content: "This is my #first post",
  likes: 150,
  repost: 20,
  tags: ["@apnacollege", "@delta"],
};

//Getting the values of the object using dot notation

console.log(student.name);
console.log(student.age);
console.log(student.marks);
console.log(student.city);
console.log(delhi.latitude);
console.log(delhi.longitude);
console.log(item.price);
console.log(item.discount);
console.log(item.color);
console.log(post.username);
console.log(post.content);
console.log(post.likes);
console.log(post.repost);
console.log(post.tags);

//Getting the values of the object using bracket notation

console.log(student["name"]);
console.log(student["age"]);
console.log(student["marks"]);
console.log(student["city"]);
console.log(delhi["latitude"]);
console.log(delhi["longitude"]);
console.log(item["price"]);
console.log(item["discount"]);
console.log(item["color"]);
console.log(post["username"]);
console.log(post["content"]);
console.log(post["likes"]);
console.log(post["repost"]);
console.log(post["tags"]);

//Adding new properties to the object

student.gender = "male";
delhi.country = "India";
item.size = "medium";
post.comments = 10;

//Getting the values of the object after adding new properties

console.log(student.gender);
console.log(delhi.country);
console.log(item.size);
console.log(post.comments);

//Deleting properties from the object

delete student.age;
delete delhi.longitude;
delete item.discount;
delete post.repost;

//Getting the values of the object after deleting properties

console.log(student.age);
console.log(delhi.longitude);
console.log(item.discount);
console.log(post.repost);

//Object of objects

const classInfo = {
  aman: {
    name: "Aman",
    city: "Delhi",
  },

  shradha: {
    name: "Shradha",
    city: "Mumbai",
  },

  karan: {
    name: "Karan",
    city: "Bangalore",
  },
};

//Getting the values of the object of objects

console.log(classInfo.aman.name);
console.log(classInfo.aman.city);
console.log(classInfo.shradha.name);
console.log(classInfo.shradha.city);
console.log(classInfo.karan.name);
console.log(classInfo.karan.city);

//Array of objects

const classInfoArray = [
  {
    name: "Aman",
    city: "Delhi",
    grade: "A+",
  },
  {
    name: "Shradha",
    city: "Mumbai",
    grade: "B",
  },
  {
    name: "Karan",
    city: "Bangalore",
    grade: "A",
  },
];

//Getting the values of the array of objects

console.log(classInfoArray[0].name);
console.log(classInfoArray[1].name);
console.log(classInfoArray[2].name);

//Adding new object to the array of objects

classInfoArray.push({
  name: "Priya",
  city: "Chennai",
  grade: "C",
});

//Math object

console.log(Math.PI);
console.log(Math.E);
console.log(Math.max(5, 10, 3));
console.log(Math.min(5, 10, 3));
console.log(Math.round(5.6));
console.log(Math.floor(5.6));
console.log(Math.ceil(5.6));

//Random number between 0 and 1

console.log(Math.random());
