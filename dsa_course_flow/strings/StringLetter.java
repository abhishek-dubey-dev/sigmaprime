package strings;

public class StringLetter {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "Abhishek";
        printLetters(str);
    }
}
