package com.abhishek.dsa.patterns;
import java.util.Scanner;

public class SolidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows for the solid rhombus pattern:");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = 1; j <= rows - i; j++) { // Loop to print spaces before stars
                System.out.print(" "); // Print a space
            }
            for (int k = 1; k <= rows; k++) { // Loop to print stars in each row
                System.out.print("*"); // Print a star
            }
            System.out.println(); // Move to the next line after printing each row
        }

        sc.close();
    }


}
