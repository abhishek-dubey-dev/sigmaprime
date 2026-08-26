package bit_manipulation;

public class ModularExponentiation {
    public static int modularExponentiation(int base, int exponent, int modulus) {
        if (modulus == 1) return 0; // Any number mod 1 is 0
        int result = 1;
        base = base % modulus; // Update base if it's more than or equal to modulus
        while (exponent > 0) {
            // If exponent is odd, multiply base with result
            if ((exponent & 1) == 1) {
                result = (result * base) % modulus;
            }
            // Right shift the exponent by 1 (divide by 2)
            exponent >>= 1;
            // Square the base
            base = (base * base) % modulus;
        }
        return result;
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 10;
        int modulus = 1000;
        System.out.println(base + " raised to the power of " + exponent + " mod " + modulus + " is: " + modularExponentiation(base, exponent, modulus));
    }
}
