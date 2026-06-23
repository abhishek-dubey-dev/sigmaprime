package com.abhishek.dsa.patterns;
import java.util.Scanner;

public class InvertedStarPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();

        for (int i = rows; i >= 1; i--) { // Loop from rows down to 1
            for (int j = 1; j <= i; j++) { // Loop from 1 to i
                System.out.print("* "); // Print a star followed by a space
            }
            System.out.println(); // Move to the next line after printing each row
        }

        sc.close();
    }

}
