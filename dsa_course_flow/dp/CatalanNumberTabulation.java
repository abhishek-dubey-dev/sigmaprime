package dp;

public class CatalanNumberTabulation {
    public static long catalan(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        long[] dp = new long[n + 1];
        dp[0] = 1;
        if (n > 0) {
            dp[1] = 1;
        }
        for (int nodes = 2; nodes <= n; nodes++) {
            for (int left = 0; left < nodes; left++) {
                dp[nodes] += dp[left] * dp[nodes - 1 - left];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println("Catalan(4): " + catalan(4));
    }
}
