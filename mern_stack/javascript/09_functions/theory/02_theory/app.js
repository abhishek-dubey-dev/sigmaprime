//this keyword is used to refer to the current object that the function is a method of. It allows you to access properties and methods of the object within the function.

const student = {
  name: "Abhishek",
  age: 28,
  english: 95,
  math: 93,
  physics: 97,
  getAvg() {
    let avg = (this.english + this.math + this.physics) / 3;
    // console.log(avg);
    console.log(`Average marks of ${this.name} is ${avg}`); //means the current object which is student in this case
  },
};

//try & catch block is used to handle errors in JavaScript. The code inside the try block is executed, and if an error occurs, the control is transferred to the catch block where you can handle the error gracefully.
//let a=5;
try {
  console.log(a);
} catch (error) {
  console.log("An error occurred...a is not defined");
  console.log(error); // Output: ReferenceError: a is not defined
}

//Miscellaneous Topics
//Arrow Functions

const sum = (a, b) => {
  console.log(a + b);
};

const cube = (n) => {
  return n * n * n;
  // return n ** 3;
  //console.log(n ** 3);
};

const pow = (a, b) => {
  return a ** b;
};

const hello = () => {
  console.log("Hello World!");
};
