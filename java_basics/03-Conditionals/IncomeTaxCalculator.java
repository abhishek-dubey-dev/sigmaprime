package com.abhishek.dsa.conditionals;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your annual income:");
        double income = sc.nextDouble();
        double tax;

        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000) {
            tax = income * 0.2; // 20% tax for income between 5 lakhs and 10 lakhs
        } else {
            tax = income * 0.3; // 30% tax for income above 10 lakhs
        }

        System.out.println("Your income tax is: " + tax);

        sc.close();
    }
}
