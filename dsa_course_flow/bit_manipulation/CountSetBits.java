package bit_manipulation;

public class CountSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if((n & 1) == 1) {
                count++; // Increment count if the least significant bit is set
            }
            n >>= 1; // Right shift n to check the next bit
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 15; // Binary representation: 1111
        System.out.println("Number of set bits in " + n + " is: " + countSetBits(n)); // Output: 4
    }
}
