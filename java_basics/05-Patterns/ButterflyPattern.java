package com.abhishek.dsa.patterns;
import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows for the butterfly pattern:");
        int rows = sc.nextInt();

        // Print the upper half of the butterfly pattern
        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = 1; j <= i; j++) { // Loop to print stars in the left wing
                System.out.print("* "); // Print a star followed by a space
            }
            for (int j = 1; j <= 2 * (rows - i); j++) { // Loop to print spaces in the middle
                System.out.print("  "); // Print two spaces
            }
            for (int j = 1; j <= i; j++) { // Loop to print stars in the right wing
                System.out.print("* "); // Print a star followed by a space
            }
            System.out.println(); // Move to the next line after printing each row
        }

        // Print the lower half of the butterfly pattern
        for (int i = rows; i >= 1; i--) { // Loop from rows down to 1
            for (int j = 1; j <= i; j++) { // Loop to print stars in the left wing
                System.out.print("* "); // Print a star followed by a space
            }
            for (int j = 1; j <= 2 * (rows - i); j++) { // Loop to print spaces in the middle
                System.out.print("  "); // Print two spaces
            }
            for (int j = 1; j <= i; j++) { // Loop to print stars in the right wing
                System.out.print("* "); // Print a star followed by a space
            }
            System.out.println(); // Move to the next line after printing each row
        }

        sc.close();
    }

}
