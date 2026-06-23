package com.abhishek.dsa.loops;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int factorial = 1; // Initialize factorial to 1

        for (int i = 1; i <= num; i++) { // Loop from 1 to num
            factorial *= i; // Multiply factorial by i (factorial = factorial * i)
        }

        System.out.println("Factorial of " + num + " is: " + factorial);

        sc.close();
    }

}
