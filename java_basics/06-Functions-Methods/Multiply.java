package com.abhishek.dsa.functionsandmethods;
import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt(); // Read the first integer from user input
        System.out.println("Enter second number:");
        int b = sc.nextInt(); // Read the second integer from user input
        int result = multiply(a, b); // Call the multiply function with a and b as arguments and store the result
        System.out.println("The product is: " + result); // Print the result to the console
        sc.close(); // Close the scanner to prevent resource leaks
    }

    public static int multiply(int num1, int num2) {  // Function that takes two integers as parameters and returns their product
        return num1 * num2; // Return the product of num1 and num2
    }

}
