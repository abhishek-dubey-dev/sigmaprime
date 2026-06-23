import java.util.Scanner;

public class TypePromotion {
    public static void main(String[] args) {
        int a = 10;
        double b = 5.5;

        // Type promotion happens here, 'a' is promoted to double before addition
        double result = a + b;

        System.out.println("The result of adding int and double is: " + result);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = sc.nextInt();
        // Type promotion happens here, 'userInput' is promoted to double before
        // addition
        double finalResult = userInput + b;
        System.out.println("The result of adding user input and double is: " + finalResult);
        sc.close();

        // Type promotion can also happen in other operations like multiplication,
        // division, etc.
        double multiplicationResult = a * b; // 'a' is promoted to double before multiplication
        System.out.println("The result of multiplying int and double is: " + multiplicationResult);

        double divisionResult = a / b; // 'a' is promoted to double before division
        System.out.println("The result of dividing int by double is: " + divisionResult);

        // Type promotion can also happen in expressions with multiple operations
        double complexResult = a + b * 2; // 'a' is promoted to double before addition, and 'b' is promoted to double
                                          // before multiplication
        System.out.println("The result of the complex expression is: " + complexResult);

    }
}
