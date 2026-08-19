import java.util.*;

public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[50];
        System.out.println("Enter the marks of 3 students: ");
        for (int i = 0; i < 3; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("The marks of 3 students are: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
        sc.close();
    }

}
