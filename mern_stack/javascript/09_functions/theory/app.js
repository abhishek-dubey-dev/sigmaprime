//Function Definition
function funcName() {
  //function body
  console.log("Hello World");
}

//Function Call
funcName();

//Function Definition with Parameters
function greet(name) {
  console.log("Hello " + name);
}

//Function Call with Argument
greet("Abhishek");
greet("Dubey");

//Create a function to print a poem
function printPoem() {
  console.log("Twinkle, twinkle, little star,");
  console.log("How I wonder what you are!");
  console.log("Up above the world so high,");
  console.log("Like a diamond in the sky.");
}

//Function Call to print the poem
printPoem();

//Create a function to roll a dice and return a random number between 1 and 6
function rollDice() {
  return Math.floor(Math.random() * 6) + 1;
}

//Function Call to roll the dice
console.log(rollDice());

//Create a function to calculate the average of three numbers
function calculateAverage(a, b, c) {
  let avg = (a + b + c) / 3;
  console.log(avg);
}

//Function Call to calculate the average
calculateAverage(10, 20, 30);

//Create a function to print multiplication table of a given number
function printMultiplicationTable(num) {
  for (let i = num; i <= num * 10; i += num) {
    console.log(i);
  }
}

//Function Call to print multiplication table
printMultiplicationTable(5);

//return Statement
function add(a, b) {
  return a + b;
}

//Function Call to add two numbers
let sum = add(10, 20);
console.log(sum);

//Create a function to check if a person is an adult or not based on age
function isAdult(age) {
  if (age >= 18) {
    return "adult";
  } else {
    return "not adult";
  }
  console.log("Bye...Bye!");
}

//Function Call to check if a person is an adult
console.log(isAdult(20)); // Output: "adult"
console.log(isAdult(15)); // Output: "not adult"

//Create a function that returns the sum of numbers from 1 to n.

function sumOfNumbers(n) {
  let sum = 0;
  for (let i = 1; i <= n; i++) {
    sum += i; // sum = sum + i
  }
  return sum;
}

//Function Call to get the sum of numbers from 1 to n
console.log(sumOfNumbers(5)); // Output: 15

//Create a function that returns the concatenation of all strings in an array.
function concatenateStrings(arr) {
  let result = "";
  for (let i = 0; i < arr.length; i++) {
    result += arr[i]; // result = result + arr[i]
  }
  return result;
}

//Function Call to concatenate strings in an array
const strings = ["Hello", " ", "World", "!"];
console.log(concatenateStrings(strings)); // Output: "Hello World!"

//Scope of Variables, objects, and functions in JavaScript
//Global Scope
let globalVar = "I am a global variable";

function globalFunction() {
  console.log(globalVar); // Accessing global variable inside a function
}

//Function Call to access global variable
globalFunction(); // Output: "I am a global variable"

//Local Scope
function localFunction() {
  let localVar = "I am a local variable";
  console.log(localVar); // Accessing local variable inside the function
}

//Function Call to access local variable
localFunction(); // Output: "I am a local variable"

//Block Scope
if (true) {
  let blockVar = "I am a block-scoped variable";
  console.log(blockVar); // Accessing block-scoped variable inside the block
}

//Function Call to access block-scoped variable
// console.log(blockVar); // Error: blockVar is not defined

//Lexical Scope
function outerFunction() {
  let outerVar = "I am an outer variable";
  function innerFunction() {
    let innerVar = "I am an inner variable";
    console.log(outerVar); // Accessing outer variable inside inner function
    console.log(innerVar); // Accessing inner variable inside inner function
  }
  innerFunction();
}

//Function Call to access outer and inner variables
outerFunction(); // Output: "I am an outer variable" "I am an inner variable"

//Function Expression
const addNumbers = function (a, b) {
  return a + b;
};

//Function Call to add two numbers using function expression
console.log(addNumbers(10, 20)); // Output: 30

//Higher-Order Functions
function multipleGreet(func, count) {
  for (let i = 0; i <= count; i++) {
    func();
  }
}

//Function Expression to greet
let greetFunc = function () {
  console.log("Hello!");
};

//Calling multipleGreet with greetFunc and count 3
multipleGreet(greetFunc, 3); // Output: "Hello!" printed 4 times

//Higher-Order Function that takes a function as an argument and returns a new function
//for odd numbers
function createOddNumberChecker() {
  return function (num) {
    return num % 2 !== 0;
  };
}
//Function Call to createOddNumberChecker
const isOdd = createOddNumberChecker();
console.log(isOdd(3));

//for even numbers
function createEvenNumberChecker() {
  return function (num) {
    return num % 2 === 0;
  };
}
//Function Call to createEvenNumberChecker
const isEven = createEvenNumberChecker();
console.log(isEven(4));

//Method vs Function
//Method
const calculator = {
  add: function (a, b) {
    return a + b;
  },
  subtract: function (a, b) {
    return a - b;
  },
  multiply: function (a, b) {
    return a * b;
  },
};
calculator.add(10, 20); // Output: 30
calculator.subtract(20, 10); // Output: 10
calculator.multiply(10, 20); // Output: 200

//Function
function greet() {
  console.log("Hello!");
}
greet(); // Output: "Hello!"
