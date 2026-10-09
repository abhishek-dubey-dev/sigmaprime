package dp;

public class LongestCommonSubsequenceRecursion {
    public static int lcs(String first, String second) {
        if (first == null || second == null) {
            throw new IllegalArgumentException("strings must not be null");
        }
        return lcs(first, second, first.length(), second.length());
    }

    private static int lcs(String first, String second, int i, int j) {
        if (i == 0 || j == 0) {
            return 0;
        }
        if (first.charAt(i - 1) == second.charAt(j - 1)) {
            return 1 + lcs(first, second, i - 1, j - 1);
        }
        return Math.max(lcs(first, second, i - 1, j), lcs(first, second, i, j - 1));
    }

    public static void main(String[] args) {
        System.out.println("LCS length: " + lcs("abcde", "ace"));
    }
}
