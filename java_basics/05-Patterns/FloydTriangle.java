package com.abhishek.dsa.patterns;
import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();

        int number = 1; // Initialize the first number to be printed

        for (int i = 1; i <= rows; i++) { // Loop from 1 to rows
            for (int j = 1; j <= i; j++) { // Loop from 1 to i
                System.out.print(number + " "); // Print the current number followed by a space
                number++; // Increment the number for the next print
            }
            System.out.println(); // Move to the next line after printing each row
        }

        sc.close();
    }
}
