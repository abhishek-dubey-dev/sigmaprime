package com.abhishek.dsa.loops;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int i = 1; // Initialization
        System.out.println("Numbers from 1 to " + num + ":"); // Loop header with condition check at the end
        do {  // Loop body will execute at least once
            System.out.print(i + " ");
            i++;  // Increment to avoid infinite loop
        } while (i <= num); // Condition to check after executing the loop body

        sc.close();
    }

}
