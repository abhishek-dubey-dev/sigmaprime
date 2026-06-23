package com.abhishek.dsa.loops;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        System.out.println("While loop output:");
        int i = 1; // Initialize i to 1
        while (i <= num) { // Loop will run as long as i is less than or equal to num
            System.out.print(i + " "); // Print the current value of i followed by a space
            i++; // Increment i by 1 in each iteration to avoid an infinite loop
        }

        sc.close();
    }

}
