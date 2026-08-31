package recursion;

public class XToPowerN {
    public static int power(int x, int n) {
        // base case
        if (n == 0) {
            return 1;
        }

        /*
         * int xnm1 = power(x, n);
         * int xn = x*xnm1;
         * 
         * return x * power(x, n - 1);
         */

        // optimised
        int halfPowerSq = power(x, n / 2) * power(x, n / 2);

        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        // System.out.println(power(2, 10));
        int x = 2;
        int n = 10;
        System.out.println(power(x, n));
    }
}
