let todo = [];

let req = prompt("Please enter your request");

while (true) {
  if (req === "quit") {
    console.log("You have exited the app");
    break;
  }
  if (req === "list") {
    console.log("**********");
    for (i = 0; i < todo.length; i++) {
      console.log(i, todo[i]);
    }
    console.log("**********");
  } else if (req === "add") {
    let newTask = prompt("Please enter the task you want to add");
    todo.push(newTask);
    console.log("Task added");
  } else if (req === "delete") {
    let idx = prompt("Please enter the index of the task you want to delete");
    todo.splice(idx, 1);
    console.log("Task deleted");
  } else {
    console.log("Invalid request");
  }
  req = prompt("Please enter your request");
}
