package bit_manipulation;

public class NumberOddEven{

public static void checkOddEven(int number) {
    int bitMask = 1; // Bitmask to check the least significant bit
        if ((number & bitMask) == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
    public static void main(String[] args) {
    checkOddEven(5); // Output: 5 is odd.
    checkOddEven(10); // Output: 10 is even.
    }

}