package com.abhishek.dsa.patterns;
import java.util.Scanner;

public class HalfPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows for the half pyramid pattern:");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = 1; j <= i; j++) { // Loop to print numbers in each row
                System.out.print(j + " "); // Print j followed by a space
            }
            System.out.println(); // Move to the next line after printing each row
        }

        sc.close();
    }

}
