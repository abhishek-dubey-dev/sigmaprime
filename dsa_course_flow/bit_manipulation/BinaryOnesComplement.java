package bit_manipulation;

public class BinaryOnesComplement {
    public static void main(String[] args) {
        int a = 5; // 0101 in binary
        int result = ~a; // Perform bitwise NOT operation (one's complement)
        System.out.println("Result of ~" + a + " = " + result); // Output: -6 (in two's complement representation)
    }
}
