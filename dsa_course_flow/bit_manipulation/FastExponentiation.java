package bit_manipulation;

public class FastExponentiation {
    public static int fastExponentiation(int base, int exponent) {
        int result = 1;
        while (exponent > 0) {
            // If exponent is odd, multiply the base with result
            if ((exponent & 1) == 1) {
                result *= base;
            }
            // Right shift the exponent by 1 (equivalent to dividing by 2)
            exponent >>= 1;
            // Square the base
            base *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 10;
        System.out.println(base + " raised to the power of " + exponent + " is: " + fastExponentiation(base, exponent));
    }
}
