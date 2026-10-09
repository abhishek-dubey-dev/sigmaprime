package dp;

public class LongestCommonSubsequenceMemoization {
    public static int lcs(String first, String second) {
        if (first == null || second == null) {
            throw new IllegalArgumentException("strings must not be null");
        }
        int[][] memo = new int[first.length() + 1][second.length() + 1];
        for (int[] row : memo) {
            java.util.Arrays.fill(row, -1);
        }
        return lcs(first, second, first.length(), second.length(), memo);
    }

    private static int lcs(String first, String second, int i, int j, int[][] memo) {
        if (i == 0 || j == 0) {
            return 0;
        }
        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        if (first.charAt(i - 1) == second.charAt(j - 1)) {
            memo[i][j] = 1 + lcs(first, second, i - 1, j - 1, memo);
        } else {
            memo[i][j] = Math.max(lcs(first, second, i - 1, j, memo),
                    lcs(first, second, i, j - 1, memo));
        }
        return memo[i][j];
    }

    public static void main(String[] args) {
        System.out.println("LCS length: " + lcs("abcde", "ace"));
    }
}
