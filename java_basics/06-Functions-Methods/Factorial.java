package com.abhishek.dsa.functionsandmethods;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        long factorial = calculateFactorial(n);
        System.out.println("The factorial of " + n + " is: " + factorial);
        sc.close();
    }

    public static long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        long factorial = 1; // Initialize factorial to 1, as the factorial of 0 and 1 is 1
        for (int i = 2; i <= num; i++) { // Loop from 2 to num to calculate the factorial
            factorial *= i; // Multiply the current value of factorial by i and update factorial
        }
        return factorial;
    }
}
