package com.abhishek.dsa.operators;
import java.util.Scanner;

public class AssignmentOperators {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number:");
    int num = sc.nextInt();

    // Using assignment operators
    num += 5; // Equivalent to num = num + 5
    System.out.println("After += 5: " + num);

    num -= 3; // Equivalent to num = num - 3
    System.out.println("After -= 3: " + num);

    num *= 2; // Equivalent to num = num * 2
    System.out.println("After *= 2: " + num);

    num /= 4; // Equivalent to num = num / 4
    System.out.println("After /= 4: " + num);

    num %= 3; // Equivalent to num = num % 3
    System.out.println("After %= 3: " + num);

    sc.close();
}
}
