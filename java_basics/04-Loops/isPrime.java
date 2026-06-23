package com.abhishek.dsa.loops;
import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        boolean isPrime = true; // Assume the number is prime until proven otherwise

        if (num <= 1) {
            isPrime = false; // 0 and 1 are not prime numbers
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) { // Check divisibility up to the square root of num
                if (num % i == 0) {
                    isPrime = false; // If num is divisible by any number other than 1 and itself, it's not prime
                    break; // Exit the loop early since we found a divisor
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        sc.close();
    }

}
