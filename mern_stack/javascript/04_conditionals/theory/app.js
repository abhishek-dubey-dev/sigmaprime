//Conditional Statements

//if
/* console.log("Before my if statement");
let age = 23;
if (age >= 18) {
  console.log("You can vote");
  console.log("You can drive");
}

console.log("After my if statement");
if (age > 20) {
  console.log("You are in your 20s");
}

let firstName = "Abhishek";
if (firstName == "Abhishek") {
  console.log(`Welcome ${firstName}`);
} */

//else if
/* let age = 14;
if (age >= 18) {
  console.log("You can vote");
} else if (age < 18) {
  console.log("You can not vote");
} else if (age < 18) {
  console.log("You can not vote");
} */

/* let marks = 75;

if (marks >= 80) {
  console.log("A+");
} else if (marks >= 60) {
  console.log("A");
} else if (marks >= 33) {
  console.log("B");
} else if (marks < 33) {
  console.log("F");
}
 */

//else
/* let age = 18;
if (age >= 18) {
  console.log("You can vote");
} else {
  console.log("You can not vote");
} */

//nested if-else
/* let marks = 32;

if (marks >= 33) {
  console.log("Pass");
  if (marks >= 80) {
    console.log("Grade: O");
  } else {
    console.log("Grade : A");
  }
} else {
  console.log("Better luck next time!");
} */

//Switch Statements
let color = "red";
switch (color) {
  case "red":
    console.log("Stop!");
    break;
  case "yellow":
    console.log("Slow down");
    break;
  case "green":
    console.log("GO");
    break;
  default:
    console.log("Broken light");
}
