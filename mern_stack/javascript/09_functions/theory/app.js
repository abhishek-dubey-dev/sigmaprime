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
  return avg;
}

//Function Call to calculate the average
let average = calculateAverage(10, 20, 30);
console.log("The average is: " + average);

//Create a function to print multiplication table of a given number
function printMultiplicationTable(num) {
  for (let i = 1; i <= 10; i++) {
    console.log(num + " x " + i + " = " + (num * i));
  }
}

//Function Call to print multiplication table
printMultiplicationTable(5);
