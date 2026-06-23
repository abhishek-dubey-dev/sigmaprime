import java.util.Scanner;

public class AreaOfCircle {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Creating a Scanner object to read input from the console

    System.out.print("Enter the radius of the circle: "); // Prompting the user to enter the radius
    double radius = sc.nextDouble(); // Reading a double input from the user and storing it in radius

    double area = Math.PI * radius * radius; // Calculating the area of the circle using the formula A = πr^2

    System.out.println("The area of the circle with radius " + radius + " is: " + area); // Printing the result to the console

    sc.close(); // Closing the Scanner object to free up resources
}
}
