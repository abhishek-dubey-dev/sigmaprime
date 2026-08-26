package bit_manipulation;

public class ClearLastIBits {
    public static int clearLastIBits(int n, int i) {
        // Create a mask with all bits set to 1 except the last i bits
        int mask = ~((1 << i) - 1);
        // Perform bitwise AND operation to clear the last i bits
        return n & mask;
    }

    public static void main(String[] args) {
        int n = 15; // Binary representation: 1111
        int i = 2;
        int updatedNumber = clearLastIBits(n, i);
        System.out.println("After clearing the last " + i + " bits of " + n + ", the new number is: " + updatedNumber); // Output: 12 (1100 in binary)
    }
}
