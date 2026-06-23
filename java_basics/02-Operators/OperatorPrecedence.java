package com.abhishek.dsa.operators;

import java.util.Scanner;

public class OperatorPrecedence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        // Demonstrating operator precedence
        int result = num1 + num2 * 2; // Multiplication has higher precedence than addition
        System.out.println("Result of num1 + num2 * 2: " + result);

        result = (num1 + num2) * 2; // Parentheses change the order of evaluation
        System.out.println("Result of (num1 + num2) * 2: " + result);

        // More complex expression
        result = num1 * num2 + num1 / num2 - num1 % num2; // Multiplication, division, and modulus have higher
                                                          // precedence than addition and subtraction
        System.out.println("Result of num1 * num2 + num1 / num2 - num1 % num2: " + result);

        sc.close();
    }
}
