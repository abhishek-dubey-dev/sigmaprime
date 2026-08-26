package bit_manipulation;

public class GetIthBit {
    public static int getIthBit(int n, int i) {
       int bitMask=1<<i;
       if((n & bitMask)==0){
        return 0;
    } else {
        return 1;
    }
    }
    public static void main(String[] args) {
        int n = 5; // Binary representation: 0101
        int i = 2;
        int ithBit = getIthBit(n, i);
        System.out.println("The " + i + "th bit of " + n + " is: " + ithBit); // Output: 1
    }
}
