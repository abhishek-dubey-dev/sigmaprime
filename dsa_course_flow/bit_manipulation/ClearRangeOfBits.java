package bit_manipulation;

public class ClearRangeOfBits {
    public static int clearRangeOfBits(int n, int i, int j) {
        // Create a mask to clear bits from position i to j
        int allOnes = ~0; // All bits set to 1
        int left = allOnes << (j + 1); // 1s before position j
        int right = (1 << i) - 1; // 1s after position i
        int mask = left | right; // Combine left and right masks

        return n & mask; // Clear the bits in the range [i, j]
    }

    private static void printBinary(int n) {
        StringBuilder binary = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            int bit = (n >> i) & 1;
            binary.append(bit);
        }
        System.out.println(binary.toString());
    }

    public static void main(String[] args) {
        int n = 15; // Binary representation: 1111
        int i = 1, j = 2;
        int updatedNumber = clearRangeOfBits(n, i, j);
        System.out.println("After clearing bits from position " + i + " to " + j + " of " + n + ", the new number is: " + updatedNumber);
        printBinary(updatedNumber);
    }
}
