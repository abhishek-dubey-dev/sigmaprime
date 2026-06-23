package com.abhishek.dsa.functionsandmethods;
import java.util.Scanner;

public class DecimalToBinary {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        DecimalToBinary obj = new DecimalToBinary();
        System.out.println("Enter a decimal number:");
        int decimalNumber = obj.sc.nextInt();
        String binaryString = obj.decimalToBinary(decimalNumber);
        System.out.println("The binary representation of " + decimalNumber + " is: " + binaryString);
        obj.sc.close();
    }
    public String decimalToBinary(int decimalNumber) {
        StringBuilder binaryString = new StringBuilder();
        while (decimalNumber > 0) { // Loop until the decimal number becomes 0
            int remainder = decimalNumber % 2; // Get the remainder when dividing by 2 (0 or 1)
            binaryString.insert(0, remainder); // Insert the remainder at the beginning of the binary string
            decimalNumber /= 2; // Divide the decimal number by 2 to get the next quotient
        }
        return binaryString.toString(); // Convert the StringBuilder to a String and return it
    }

}
