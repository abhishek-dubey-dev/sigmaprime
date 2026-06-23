package com.abhishek.dsa.functionsandmethods;
import java.util.Scanner;

public class BinomialCoefficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter r:");
        int r = sc.nextInt();
        long result = calculateBinomialCoefficient(n, r);
        System.out.println("The binomial coefficient C(" + n + ", " + r + ") is: " + result);
        sc.close();
    }
    public static long calculateBinomialCoefficient(int n, int r) {
        if (r > n || r < 0) {
            return 0; // If r is greater than n or negative, the binomial coefficient is 0
        }
        if (r == 0 || r == n) {
            return 1; // C(n, 0) and C(n, n) are both equal to 1
        }
        long numerator = 1; // Initialize numerator to 1
        long denominator = 1; // Initialize denominator to 1
        for (int i = 1; i <= r; i++) { // Loop from 1 to r to calculate the numerator and denominator
            numerator *= (n - i + 1); // Multiply the current value of numerator by (n - i + 1)
            denominator *= i; // Multiply the current value of denominator by i
        }
        return numerator / denominator; // Return the result of numerator divided by denominator
    }

}
