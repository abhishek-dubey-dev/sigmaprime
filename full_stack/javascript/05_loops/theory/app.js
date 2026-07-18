//For Loop
for (let i = 0; i < 5; i++) {
  console.log(i);
}

//Print odd numbers from 1 to 10
for (let i = 1; i <= 10; i++) {
  if (i % 2 !== 0) {
    console.log(i);
  }
}

//Print even numbers from 1 to 10
for (let i = 1; i <= 10; i++) {
  if (i % 2 === 0) {
    console.log(i);
  }
}

//Infinite Loop
// for (let i = 0; i < 5; i--) {
//     console.log(i);
// }

//Print multiplication table of 5
for (let i = 1; i <= 10; i++) {
  console.log(5 * i);
}

//Nested Loop
for (let i = 1; i <= 3; i++) {
  for (let j = 1; j <= 3; j++) {
    console.log(i + " " + j);
  }
}

//While Loop
let j = 0;
while (j < 5) {
  console.log(j);
  j++;
}

//Break Statement
for (let i = 0; i < 10; i++) {
  if (i === 5) {
    break;
  }
  console.log(i);
}

//Continue Statement
for (let i = 0; i < 10; i++) {
  if (i === 5) {
    continue;
  }
  console.log(i);
}

//Loop through an array
const fruits = ["Apple", "Banana", "Cherry", "Date"];
for (let i = 0; i < fruits.length; i++) {
  console.log(fruits[i]);
}

//Loop through nested arrays
const nestedArray = [
  [1, 2],
  [3, 4],
  [5, 6],
];
for (let i = 0; i < nestedArray.length; i++) {
  for (let j = 0; j < nestedArray[i].length; j++) {
    console.log(nestedArray[i][j]);
  }
}

//for...of Loop
const colors = ["Red", "Green", "Blue"];
for (const color of colors) {
  console.log(color);
}

//for...in Loop
const person = { name: "John", age: 30, city: "New York" };
for (const key in person) {
  console.log(key + ": " + person[key]);
}

//Nested for...of Loop
const matrix = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
];
for (const row of matrix) {
  for (const element of row) {
    console.log(element);
  }
}

//Do...While Loop
let k = 0;
do {
  console.log(k);
  k++;
} while (k < 5);
