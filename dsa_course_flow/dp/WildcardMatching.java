package dp;

public class WildcardMatching {
    public static boolean matches(String text, String pattern) {
        if (text == null || pattern == null) {
            throw new IllegalArgumentException("text and pattern must not be null");
        }

        boolean[][] dp = new boolean[text.length() + 1][pattern.length() + 1];
        dp[0][0] = true;
        for (int j = 1; j <= pattern.length(); j++) {
            if (pattern.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }
        for (int i = 1; i <= text.length(); i++) {
            for (int j = 1; j <= pattern.length(); j++) {
                char token = pattern.charAt(j - 1);
                if (token == '*') {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                } else if (token == '?' || token == text.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }
        return dp[text.length()][pattern.length()];
    }

    public static void main(String[] args) {
        System.out.println("Matches: " + matches("baaabab", "ba*a?"));
    }
}
