package com.abhishek.dsa.functionsandmethods;
import java.util.Scanner;

public class PrimesInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start of the range:");
        int start = sc.nextInt();
        System.out.println("Enter the end of the range:");
        int end = sc.nextInt();
        System.out.println("Prime numbers in the range " + start + " to " + end + ":");
        printPrimesInRange(start, end);
        System.out.println("\nIs " + end + " a prime number? " + isPrime(end));
        sc.close();
        
    }
    public static void printPrimesInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
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

    //Check if a number is prime or not
    public static boolean isPrime(int n) {
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
