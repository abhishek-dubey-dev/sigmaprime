package com.abhishek.dsa.operators;
import java.util.Scanner;

public class LogicalOperators {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the first boolean value (true/false):");
    boolean bool1 = sc.nextBoolean();

    System.out.println("Enter the second boolean value (true/false):");
    boolean bool2 = sc.nextBoolean();

    // Using logical operators
    boolean andResult = bool1 && bool2; // Logical AND
    boolean orResult = bool1 || bool2; // Logical OR
    boolean notResult1 = !bool1; // Logical NOT for bool1
    boolean notResult2 = !bool2; // Logical NOT for bool2

    System.out.println("Logical AND: " + andResult);
    System.out.println("Logical OR: " + orResult);
    System.out.println("Logical NOT of first value: " + notResult1);
    System.out.println("Logical NOT of second value: " + notResult2);

    sc.close();
}
}
