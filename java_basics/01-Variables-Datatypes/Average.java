import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int A = sc.nextInt();

        System.out.println("Enter the second number:");
        int B = sc.nextInt();

        System.out.println("Enter the third number:");
        int C = sc.nextInt();

        int sum = A + B + C;
        double average = sum / 3.0;
        System.out.println("The average is: " + average);

        sc.close();
    }
}
