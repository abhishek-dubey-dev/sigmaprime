package com.abhishek.dsa.loops;
import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int reverse = 0; // Variable to store the reverse of the number
        while (num != 0) { // Loop until the number becomes 0
            int digit = num % 10; // Get the last digit of the number
            reverse = reverse * 10 + digit; // Append the digit to the reverse
            num /= 10; // Remove the last digit from the number
        }

        System.out.println("The reverse of the number is: " + reverse);

        sc.close();
    }

}
