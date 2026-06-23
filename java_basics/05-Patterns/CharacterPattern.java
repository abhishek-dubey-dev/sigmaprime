package com.abhishek.dsa.patterns;
import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();

        char ch = 'A'; // Starting character

        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = 1; j <= i; j++) { // Loop through each column in the current row
                System.out.print(ch + " "); // Print the current character followed by a space
                ch++; // Move to the next character
            }
            System.out.println(); // Move to the next line after each row
        }

        sc.close();
    }

}
