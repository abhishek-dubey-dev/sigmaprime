package com.abhishek.dsa.functionsandmethods;

import java.util.Scanner;

public class FunctionReturnType {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        // Call the add function and store the result
        int result = add(num1, num2);
        System.out.println("The sum is: " + result);

        // Call the multiply function and store the result
        double product = multiply(3.5, 2.0);
        System.out.println("The product is: " + product);

        // Call the greet function and store the result
        String greeting = greet("Alice");
        System.out.println(greeting);

        // Call the printMessage function
        printMessage("This is a test message.");

        // Call the isEven function and store the result
        boolean isEven = isEven(4);
        System.out.println("Is 4 even? " + isEven);

        // Call the createArray function and store the result
        int[] numbers = createArray(5);
        System.out.print("Created array: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Call the createPerson function and store the result
        Person person = createPerson("Bob", 25);
        System.out.println("Created person: " + person.name + ", age " + person.age);

        // Call the displayInfo function
        displayInfo("This is some information to display.");

        sc.close();
    }

    // Function that returns an integer
    public static int add(int a, int b) {
        return a + b;
    }

    // Function that returns a double
    public static double multiply(double x, double y) {
        return x * y;
    }

    // Function that returns a String
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    // Function that returns void
    public static void printMessage(String message) {
        System.out.println(message);
    }

    // Function that returns a boolean
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Function that returns an array
    public static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    // Function that returns an object
    public static Person createPerson(String name, int age) {
        return new Person(name, age);
    }

    // Inner Class
    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    // Function that does not return anything (void)
    public static void displayInfo(String info) {
        System.out.println("Info: " + info);
    }
}
