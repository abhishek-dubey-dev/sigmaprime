package com.abhishek.dsa.functionsandmethods;
import java.util.Scanner;

public class BinaryToDecimal {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        BinaryToDecimal obj = new BinaryToDecimal();
        System.out.println("Enter a binary number:");
        String binaryString = obj.sc.nextLine();
        int decimalValue = obj.binaryToDecimal(binaryString);
        System.out.println("The decimal value of " + binaryString + " is: " + decimalValue);
        obj.sc.close();
    }
    public int binaryToDecimal(String binaryString) {
        int decimalValue = 0;
        int power = 0;
        for (int i = binaryString.length() - 1; i >= 0; i--) { // Loop through the binary string from right to left
            if (binaryString.charAt(i) == '1') { // If the current character is '1', add the corresponding power of 2 to the decimal value
                decimalValue += Math.pow(2, power); // If the current character is '1', add 2^power to the decimal value
            }
            power++; // Increment the power for the next iteration (moving left in the binary string)
        }
        return decimalValue;
    }

}
