package com.abhishek.dsa.loops;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        System.out.println("Numbers from 1 to " + num + ":");
        for (int i = 1; i <= num; i++) { // Loop from 1 to num //Inialization, Condition, Increment/Decrement
            System.out.print(i + " ");
        }

        sc.close();
    }

}
