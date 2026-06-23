package com.abhishek.dsa.loops;
import java.util.Scanner;

public class OneToTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        System.out.println("Numbers from 1 to " + num + ":");
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }

        sc.close();
    }

}
