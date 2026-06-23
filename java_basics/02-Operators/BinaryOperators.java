package com.abhishek.dsa.operators;
import java.util.Scanner;

public class BinaryOperators {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the first number:");
    int num1 = sc.nextInt();

    System.out.println("Enter the second number:");
    int num2 = sc.nextInt();

    // Using binary operators
    int sum = num1 + num2; // Addition
    int difference = num1 - num2; // Subtraction
    int product = num1 * num2; // Multiplication
    double quotient = (double) num1 / num2; // Division (casting to double for accurate result)
    int modulus = num1 % num2; // Modulus

    System.out.println("Sum: " + sum);
    System.out.println("Difference: " + difference);
    System.out.println("Product: " + product);
    System.out.println("Quotient: " + quotient);
    System.out.println("Modulus: " + modulus);

    sc.close();
}
}
