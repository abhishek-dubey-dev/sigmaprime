package com.abhishek.dsa.loops;
import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                sumEven += i; // Add even numbers to sumEven
            } else {
                sumOdd += i; // Add odd numbers to sumOdd
            }
        }

        System.out.println("Sum of even numbers from 1 to " + num + ": " + sumEven);
        System.out.println("Sum of odd numbers from 1 to " + num + ": " + sumOdd);

        sc.close();
    }

}
