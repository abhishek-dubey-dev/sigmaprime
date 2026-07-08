//Array Methods

//forEach

//let arr = [1, 2, 3, 4, 5];

/* arr.forEach((el) => {
  console.log(el);
}); */

/* arr.forEach(function (el) {
  console.log(el);
}); */

/* let print = function (el) {
  console.log(el);
};

arr.forEach(print); */

//forEach for array of objects

let arr = [
  {
    name: "Abhishek",
    marks: 95,
  },
  {
    name: "Shailja",
    marks: 94.4,
  },
  {
    name: "Aman",
    marks: 92,
  },
];

arr.forEach((student) => {
  console.log(student.marks);
});


//map
