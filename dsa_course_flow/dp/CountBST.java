package dp;

public class CountBST {
    public static long countBSTs(int keys) {
        if (keys < 0) {
            throw new IllegalArgumentException("keys must be non-negative");
        }

        long[] dp = new long[keys + 1];
        dp[0] = 1;
        for (int nodes = 1; nodes <= keys; nodes++) {
            for (int root = 0; root < nodes; root++) {
                dp[nodes] += dp[root] * dp[nodes - 1 - root];
            }
        }
        return dp[keys];
    }

    public static void main(String[] args) {
        System.out.println("BSTs with 3 keys: " + countBSTs(3));
    }
}
