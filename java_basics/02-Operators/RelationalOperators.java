package com.abhishek.dsa.operators;
import java.util.Scanner;

public class RelationalOperators {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the first number:");
    int num1 = sc.nextInt();

    System.out.println("Enter the second number:");
    int num2 = sc.nextInt();

    // Using relational operators
    boolean isEqual = num1 == num2; // Equal to
    boolean isNotEqual = num1 != num2; // Not equal to
    boolean isGreaterThan = num1 > num2; // Greater than
    boolean isLessThan = num1 < num2; // Less than
    boolean isGreaterThanOrEqualTo = num1 >= num2; // Greater than or equal to
    boolean isLessThanOrEqualTo = num1 <= num2; // Less than or equal to

    System.out.println("Is Equal: " + isEqual);
    System.out.println("Is Not Equal: " + isNotEqual);
    System.out.println("Is Greater Than: " + isGreaterThan);
    System.out.println("Is Less Than: " + isLessThan);
    System.out.println("Is Greater Than or Equal To: " + isGreaterThanOrEqualTo);
    System.out.println("Is Less Than or Equal To: " + isLessThanOrEqualTo);

    sc.close();
}
}
