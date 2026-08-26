package bit_manipulation;

public class ClearIthBit {
    public static int clearIthBit(int n, int i) {
        // Create a mask with all bits set to 1 except the ith bit
        int mask = ~(1 << i);
        // Perform bitwise AND operation to clear the ith bit
        return n & mask;
    }

    public static void main(String[] args) {
        int n = 5; // Binary representation: 0101
        int i = 2;
        int updatedNumber = clearIthBit(n, i);
        System.out.println("After clearing the " + i + "th bit of " + n + ", the new number is: " + updatedNumber); // Output: 1 (0001 in binary)
    }
}
