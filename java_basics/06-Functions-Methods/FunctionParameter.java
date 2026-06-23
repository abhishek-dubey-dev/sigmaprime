package com.abhishek.dsa.functionsandmethods;

import java.util.Scanner;

public class FunctionParameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt(); // Read the first integer from user input
        System.out.println("Enter second number:");
        int b = sc.nextInt(); // Read the second integer from user input
        calculateSum(a, b); // Arguments or actual parameters a and b are passed to the calculateSum function
        sc.close(); // Close the scanner to prevent resource leaks
    }

    public static void calculateSum(int num1, int num2) {  //Parameters or formal parameters num1 and num2 are defined in the function signature
        int sum = num1 + num2; // Calculate the sum of num1 and num2
        System.out.println("The sum is: " + sum); // Print the result to the console
    }
}
