import java.util.Scanner; // Importing the Scanner class to read user input

public class UserInputSum {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Creating a Scanner object to read input from the console

    System.out.print("Enter first number: "); // Prompting the user to enter the first number
    int num1 = sc.nextInt(); // Reading an integer input from the user and storing it in num1

    System.out.print("Enter second number: "); // Prompting the user to enter the second number
    int num2 = sc.nextInt(); // Reading an integer input from the user and storing it in num2

    int sum = num1 + num2; // Calculating the sum of num1 and num2 and storing it in the variable sum

    System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum); // Printing the result to the console

    sc.close(); // Closing the Scanner object to free up resources
}
}
