package com.abhishek.dsa.functionsandmethods;
import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        boolean result = checkPrime(n);
        if (result) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
        sc.close();
    }
    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // Loop from 2 to the square root of n to check for factors
            if (n % i == 0) { // If n is divisible by any number in this range, it is not prime
                return false;
            }
        }
        return true; // If no factors are found, n is a prime number
    }

}
