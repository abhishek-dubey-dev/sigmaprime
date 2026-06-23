package com.abhishek.dsa.loops;
import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        System.out.println("Numbers from 1 to " + num + ":");
        for (int i = 1; i <= num; i++) {
            if (i == 5) { // Break the loop when i is 5
                break; // Exit the loop immediately
            }
            System.out.print(i + " ");
        }

        sc.close();
    }

}
