package com.abhishek.dsa.conditionals;
import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks:");
        int marks = sc.nextInt();

        //Using Ternary Operator
        String result = (marks >= 40) ? "Pass" : "Fail"; // Ternary operator to determine if the student has passed or failed
        System.out.println("You have " + result + ".");

        sc.close();
    }
}
