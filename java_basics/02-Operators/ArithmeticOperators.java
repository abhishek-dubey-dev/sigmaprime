package com.abhishek.dsa.operators;
import java.util.Scanner;

public class ArithmeticOperators {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the first number:");
    int num1 = sc.nextInt();

    System.out.println("Enter the second number:");
    int num2 = sc.nextInt();

    int sum = num1 + num2;
    int difference = num1 - num2;
    int product = num1 * num2;
    double quotient = (double) num1 / num2; // Casting to double for accurate division
    int modulus = num1 % num2;

    System.out.println("Sum: " + sum);
    System.out.println("Difference: " + difference);
    System.out.println("Product: " + product);
    System.out.println("Quotient: " + quotient);
    System.out.println("Modulus: " + modulus);

    sc.close();
}
}
