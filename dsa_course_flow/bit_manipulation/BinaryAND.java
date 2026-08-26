package bit_manipulation;

public class BinaryAND {
    public static void main(String[] args) {
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary
        int result = a & b; // Perform bitwise AND operation
        System.out.println("Result of " + a + " & " + b + " = " + result); // Output: 1 (0001 in binary)
    }
}