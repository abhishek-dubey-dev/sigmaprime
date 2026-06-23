package com.abhishek.dsa.functionsandmethods;
import java.util.Scanner;

public class InbuiltMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("The absolute value of " + n + " is: " + Math.abs(n));
        sc.close();
    }
      //Inbuilt methods are pre-defined functions provided by programming languages or libraries that perform specific tasks. They are ready to use and can be called directly without the need for the programmer to define them. In Java, for example, there are many inbuilt methods available in classes like Math, String, Arrays, etc., which can be used to perform various operations such as mathematical calculations, string manipulation, array handling, and more. Inbuilt methods help in saving time and effort as they provide efficient and optimized solutions for common programming tasks.

}
