package com.abhishek.dsa.conditionals;
import java.util.Scanner;

public class PositiveNegative {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number:");
    int num = sc.nextInt();

    if (num > 0) {
        System.out.println(num + " is a positive number.");
    } else if (num < 0) {
        System.out.println(num + " is a negative number.");
    } else {
        System.out.println("The number is zero.");
    }

    sc.close();
}
}
