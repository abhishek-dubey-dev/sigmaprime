package bit_manipulation;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false; // Not a power of two
        }
        return (n & (n - 1)) == 0; // Returns true if n is a power of two, otherwise returns false
    }

    public static void main(String[] args) {
        int n = 16; // 16 is a power of two
        System.out.println("Is " + n + " a power of two? " + isPowerOfTwo(n)); // Output: true

        n = 15; // 15 is not a power of two
        System.out.println("Is " + n + " a power of two? " + isPowerOfTwo(n)); // Output: false
    }
}
