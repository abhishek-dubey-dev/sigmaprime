package com.abhishek.dsa.patterns;
import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows for the hollow rhombus pattern:");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = 1; j <= rows - i; j++) { // Loop to print spaces before stars
                System.out.print("  "); // Print two spaces for indentation
            }
            for (int k = 1; k <= rows; k++) { // Loop to print stars and spaces in each row
                if (i == 1 || i == rows || k == 1 || k == rows) { // Check if it's the first or last row, or the first or last column
                    System.out.print("* "); // Print a star followed by a space
                } else {
                    System.out.print("  "); // Print two spaces for hollow part
                }
            }
            System.out.println(); // Move to the next line after printing each row
        }

        sc.close();
}

}
