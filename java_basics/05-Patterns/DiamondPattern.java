package com.abhishek.dsa.patterns;
import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();

        // Upper half of the diamond
        for (int i = 1; i <= rows; i++) { // Loop from 1 to rows
            for (int j = 1; j <= rows - i; j++) { // Loop from 1 to rows - i
                System.out.print("  "); // Print two spaces for indentation
            }
            for (int k = 1; k <= 2 * i - 1; k++) { // Loop from 1 to 2*i - 1
                System.out.print("* "); // Print a star followed by a space
            }
            System.out.println(); // Move to the next line after printing each row
        }

        // Lower half of the diamond
        for (int i = rows - 1; i >= 1; i--) { // Loop from rows - 1 down to 1
            for (int j = 1; j <= rows - i; j++) { // Loop from 1 to rows - i
                System.out.print("  "); // Print two spaces for indentation
            }
            for (int k = 1; k <= 2 * i - 1; k++) { // Loop from 1 to 2*i - 1
                System.out.print("* "); // Print a star followed by a space
            }
            System.out.println(); // Move to the next line after printing each row
        }

        sc.close();
    }

}
