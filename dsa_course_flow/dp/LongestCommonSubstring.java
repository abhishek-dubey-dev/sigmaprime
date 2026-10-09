package dp;

public class LongestCommonSubstring {
    public static int longestCommonSubstring(String first, String second) {
        if (first == null || second == null) {
            throw new IllegalArgumentException("strings must not be null");
        }

        int[][] dp = new int[first.length() + 1][second.length() + 1];
        int longest = 0;
        for (int i = 1; i <= first.length(); i++) {
            for (int j = 1; j <= second.length(); j++) {
                if (first.charAt(i - 1) == second.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    longest = Math.max(longest, dp[i][j]);
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println("Longest common substring: "
                + longestCommonSubstring("ABABC", "BABCA"));
    }
}
