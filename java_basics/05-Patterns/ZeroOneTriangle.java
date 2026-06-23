package com.abhishek.dsa.patterns;
import java.util.Scanner;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) { // Loop from 1 to rows
            for (int j = 1; j <= i; j++) { // Loop from 1 to i
                if ((i + j) % 2 == 0) { // Check if the sum of row and column indices is even
                    System.out.print("1 "); // Print 1 followed by a space
                } else {
                    System.out.print("0 "); // Print 0 followed by a space
                }
            }
            System.out.println(); // Move to the next line after printing each row
        }

        sc.close();
    }

}
