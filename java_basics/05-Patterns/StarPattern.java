package com.abhishek.dsa.patterns;
import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows for the star pattern:");
        int rows = sc.nextInt();

        // Print the star pattern
        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = 1; j <= i; j++) { // Loop to print stars in each row
                System.out.print("* "); // Print a star followed by a space
            }
            System.out.println(); // Move to the next line after printing stars for the current row
        }

        sc.close();
    }

}
