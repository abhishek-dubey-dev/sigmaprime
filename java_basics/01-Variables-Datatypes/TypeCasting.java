import java.util.Scanner; // Importing the Scanner class to read user input

public class TypeCasting {
public static void main(String[] args) {
    // Implicit Type Casting (Widening)
    int num1 = 100;
    double num2 = num1; // int is automatically converted to double
    System.out.println("Implicit Type Casting (Widening): " + num2);

    // Explicit Type Casting (Narrowing)
    double num3 = 9.99;
    int num4 = (int) num3; // double is explicitly cast to int
    System.out.println("Explicit Type Casting (Narrowing): " + num4);

    // User input and type casting
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    String input = sc.nextLine(); // Reading input as String
    int userInput = Integer.parseInt(input); // Converting String to int
    System.out.println("You entered: " + userInput);

    // Widening and Narrowing examples
    char c = 'A';
    int asciiValue = (int) c; // char is explicitly cast to int to get its ASCII value
    System.out.println("ASCII value of '" + c + "' is: " + asciiValue);

    sc.close(); // Closing the Scanner object to free up resources
}
}
