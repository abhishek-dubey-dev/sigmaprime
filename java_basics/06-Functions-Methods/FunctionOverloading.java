package com.abhishek.dsa.functionsandmethods;

import java.util.Scanner;

public class FunctionOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("The sum of " + a + " and " + b + " is: " + add(a, b));

        System.out.println("Enter first decimal number:");
        int x = sc.nextInt();

        System.out.println("Enter second decimal number:");
        int y = sc.nextInt();

        System.out.println("Enter third decimal number:");
        int z = sc.nextInt();

        System.out.println("The sum of " + x + ", " + y + ", and " + z + " is: " + add(x, y, z));

        sc.close();
    }

    public static int add(int num1, int num2) { // Method to add two integers
        return num1 + num2; // Method to add two integers
    }

    public static int add(int num1, int num2, int num3) { // Method to add three integers
        return num1 + num2 + num3; // Method to add three integers
    }

}
