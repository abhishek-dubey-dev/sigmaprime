package bit_manipulation;

public class SetIthBit {
    public static int setIthBit(int n, int i) {
        // Create a mask with 1 at the ith position
        int bitMask = 1 << i;
        // Use bitwise OR to set the ith bit
        return n | bitMask;
    }

    public static void main(String[] args) {
        int n = 5; // Binary representation: 0101
        int i = 1;
        int updatedNumber = setIthBit(n, i);
        System.out.println("After setting the " + i + "th bit of " + n + ", the new number is: " + updatedNumber); // Output: 7 (0111 in binary)
    }
}
