//User enters a maximum number and the program generates a random number between 1 and that maximum number. The user then has to guess the number. The program will give hints if the guess is too high or too low until the user guesses correctly.

const maxNumber = parseInt(
  prompt("Welcome to the guessing game! Please enter a maximum number:"),
);

const randomNumber = Math.floor(Math.random() * maxNumber) + 1;

let guess = parseInt(prompt("Guess the number"));

while (true) {
  if (guess == "quit") {
    console.log("You have exited the game");
    break;
  }

  if (guess == randomNumber) {
    console.log("Congratulations! You guessed the number!");
    break;
  } else if (guess < randomNumber) {
    console.log("Too low! Try again.");
    guess = parseInt(prompt("Hint: The number is higher."));
  } else {
    console.log("Too high! Try again.");
    guess = parseInt(prompt("Hint: The number is lower."));
  }
}
