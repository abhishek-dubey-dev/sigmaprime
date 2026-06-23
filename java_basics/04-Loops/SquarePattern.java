package com.abhishek.dsa.loops;
import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the square pattern:");
        int size = sc.nextInt();

        for (int i = 1; i <= size; i++) { // Loop for rows
            for (int j = 1; j <= size; j++) { // Loop for columns
                System.out.print("* "); // Print a star followed by a space for better visibility
            }
            System.out.println();
        }

        sc.close();
    }

}
