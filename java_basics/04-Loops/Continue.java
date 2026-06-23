package com.abhishek.dsa.loops;
import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        System.out.println("Numbers from 1 to " + num + " (skipping 5):");
        for (int i = 1; i <= num; i++) {
            if (i == 5) { // Skip the number 5
                continue; // Skip the rest of the loop and move to the next iteration
            }
            System.out.print(i + " ");
        }

        sc.close();
    }


}
