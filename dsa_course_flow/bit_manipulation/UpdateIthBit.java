package bit_manipulation;

public class UpdateIthBit {
    public static int updateIthBit(int n, int i, int newBit) {
        // Clear the ith bit
        n = n & (~(1 << i));
        // Set the ith bit to newBit
        n = n | (newBit << i);
        return n;
    }

    public static void main(String[] args) {
        int n = 5; // 0101 in binary
        int i = 1; // Update the 1st bit
        int newBit = 1; // Set it to 1
        int updatedNumber = updateIthBit(n, i, newBit);
        System.out.println("Updated number: " + updatedNumber); // Output: 7 (0111 in binary)
    }
}
