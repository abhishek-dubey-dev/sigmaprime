package recursion;

public class NToOne {
    public static void printDec(int n) {
        // base case
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        printDec(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }
}
