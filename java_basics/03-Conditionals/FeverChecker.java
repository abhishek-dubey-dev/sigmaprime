package com.abhishek.dsa.conditionals;

import java.util.Scanner;

public class FeverChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your body temperature in Fahrenheit:");
        double temperature = sc.nextDouble();

        if (temperature >= 100.4) { // Check if the temperature is 100.4°F or higher
            System.out.println("You have a fever.");
        } else {
            System.out.println("Your body temperature is normal.");
        }

        sc.close();
    }

}
