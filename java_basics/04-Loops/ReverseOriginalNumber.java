package com.abhishek.dsa.loops;
import java.util.Scanner;

public class ReverseOriginalNumber {
    Scanner sc = new Scanner(System.in);
    public void reverseOriginalNumber() {
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int originalNum = num; // Store the original number for later use
        int reversedNum = 0; // Variable to store the reversed number

        while (num > 0) {
            int digit = num % 10; // Get the last digit
            reversedNum = reversedNum * 10 + digit; // Append the digit to the reversed number
            num /= 10; // Remove the last digit
        }

        System.out.println("Original number: " + originalNum); // Print the original number
        System.out.println("Reversed number: " + reversedNum); // Print the reversed number

        sc.close();
    }


}
