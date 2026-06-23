import java.util.Scanner; // Importing the Scanner class to read user input

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object to read input from the console

        String input = sc.next(); // Reading a string input from the user
        System.out.println("You entered: " + input); // Printing the input back to the console

        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Reading a line of text (including spaces) from the user
        System.out.println("Hello, " + name + "!"); // Greeting the user with their name

        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // Reading an integer input from the user
        System.out.println("You are " + age + " years old."); // Printing the user's age

        float price = sc.nextFloat(); // Reading a float input from the user
        System.out.println("The price you entered is: " + price); // Printing the price

        byte b = sc.nextByte(); // Reading a byte input from the user
        System.out.println("The byte value you entered is: " + b); // Printing the byte value

        double d = sc.nextDouble(); // Reading a double input from the user
        System.out.println("The double value you entered is: " + d); // Printing the double value

        boolean bool = sc.nextBoolean(); // Reading a boolean input from the user
        System.out.println("The boolean value you entered is: " + bool); // Printing the boolean value

        short s = sc.nextShort(); // Reading a short input from the user
        System.out.println("The short value you entered is: " + s); // Printing the short value

        long l = sc.nextLong(); // Reading a long input from the user
        System.out.println("The long value you entered is: " + l); // Printing the long value

        sc.close(); // Closing the Scanner object to free up resources
    }
}
