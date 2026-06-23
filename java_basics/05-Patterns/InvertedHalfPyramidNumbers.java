package com.abhishek.dsa.patterns;
import java.util.Scanner;

public class InvertedHalfPyramidNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();

        for (int i =1; i<=rows; i++) { // Loop from 1 to rows 
            for (int j = 1; j <= rows - i + 1; j++) { // Loop from 1 to rows - i + 1
                System.out.print(j + " "); // Print the number followed by a space
            }
            System.out.println(); // Move to the next line after printing each row
        }

        sc.close();
    }

}
