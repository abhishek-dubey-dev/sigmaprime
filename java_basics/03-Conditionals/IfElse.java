package com.abhishek.dsa.conditionals;
import java.util.Scanner;

public class IfElse {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter your age:");
    int age=sc.nextInt();

    if(age>=18){
        System.out.println("You are eligible to vote.");
    }
    if(age>13 && age<18){
        System.out.println("You are a minor.");
    }
    else{
        System.out.println("You are not eligible to vote.");
    }
    sc.close();
}
}
