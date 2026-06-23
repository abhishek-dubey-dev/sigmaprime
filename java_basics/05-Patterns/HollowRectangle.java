package com.abhishek.dsa.patterns;
import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();

        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = 1; j <= cols; j++) { // Loop through each column in the current row
                if (i == 1 || i == rows || j == 1 || j == cols) { // Check if it's the first or last row, or the first or last column
                    System.out.print("* "); // Print a star if it's on the border
                } else {
                    System.out.print("  "); // Print a space if it's inside the rectangle
                }
            }
            System.out.println(); // Move to the next line after each row
        }

        sc.close();
    }

}
