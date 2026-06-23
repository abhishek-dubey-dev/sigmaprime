package com.abhishek.dsa.conditionals;
import java.util.Scanner;

public class TernaryOperator {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number:");
    int num = sc.nextInt();

    String result = (num % 2 == 0) ? "Even" : "Odd"; // Ternary operator to determine if the number is even or odd
    System.out.println(num + " is an " + result + " number.");

    sc.close();
}
}
