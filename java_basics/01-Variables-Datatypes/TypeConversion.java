import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        // Implicit Type Conversion (Widening)
        int num1 = 100;
        double num2 = num1; // int is automatically converted to double
        System.out.println("Implicit Type Conversion: " + num2); // Output: 100.0

        // Explicit Type Conversion (Narrowing)
        double num3 = 9.99;
        int num4 = (int) num3; // double is explicitly cast to int
        System.out.println("Explicit Type Conversion: " + num4); // Output: 9

        // User input and type conversion
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.nextLine(); // Read user input as a String
        int userNumber = Integer.parseInt(input); // Convert String to int
        System.out.println("You entered: " + userNumber);

        // byte->short->int->long->float->double (Widening)
        // double->float->long->int->short->byte (Narrowing)

        // lossy conversion
        double d = 123.456;
        int i = (int) d; // This will truncate the decimal part and result in 123
        System.out.println("Lossy conversion result: " + i);

        sc.close();
    }
}
