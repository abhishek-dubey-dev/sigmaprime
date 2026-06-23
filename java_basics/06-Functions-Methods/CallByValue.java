package com.abhishek.dsa.functionsandmethods;
import java.util.Scanner;

public class CallByValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt(); // Read the first integer from user input

        System.out.println("Enter second number:");
        int b = sc.nextInt(); // Read the second integer from user input

        System.out.println("Before swapping: a = " + a + ", b = " + b); // Print the values of a and b before swapping

        swap(a, b); // Call the swap function with a and b as arguments

        System.out.println("After swapping: a = " + a + ", b = " + b); // Print the values of a and b after swapping

        sc.close(); // Close the scanner to prevent resource leaks
        
    }
    public static void swap(int a, int b) { // Function to swap the values of a and b
        int temp = a; // Store the value of a in a temporary variable
        a = b; // Assign the value of b to a
        b = temp; // Assign the value of temp (original a) to b
    }

}
