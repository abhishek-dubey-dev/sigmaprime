package bit_manipulation;

public class BinaryXOR {
    public static void main(String[] args) {
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary
        int result = a ^ b; // Perform bitwise XOR operation
        System.out.println("Result of " + a + " ^ " + b + " = " + result); // Output: 6 (0110 in binary)
    }
}
