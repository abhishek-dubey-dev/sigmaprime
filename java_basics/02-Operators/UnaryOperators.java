package com.abhishek.dsa.operators;
import java.util.Scanner;

public class UnaryOperators {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number:");
    int num = sc.nextInt();

    // Using unary operators
    int incrementedValue = ++num; // Pre-increment
    int decrementedValue = --num; // Pre-decrement
    int postIncrementedValue = num++; // Post-increment
    int postDecrementedValue = num--; // Post-decrement
    
    System.out.println("Incremented Value: " + incrementedValue);
    System.out.println("Decremented Value: " + decrementedValue);
    System.out.println("Post-incremented Value: " + postIncrementedValue);
    System.out.println("Post-decremented Value: " + postDecrementedValue);

    sc.close();
}
}
