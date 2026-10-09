package dp;

public class MatrixChainMultiplicationTabulation {
    public static long minimumCost(int[] dimensions) {
        MatrixChainMultiplicationMemoization.validateDimensions(dimensions);
        int matrices = dimensions.length - 1;
        long[][] dp = new long[matrices + 1][matrices + 1];
        for (int chainLength = 2; chainLength <= matrices; chainLength++) {
            for (int first = 1; first <= matrices - chainLength + 1; first++) {
                int last = first + chainLength - 1;
                dp[first][last] = Long.MAX_VALUE;
                for (int split = first; split < last; split++) {
                    long cost = dp[first][split] + dp[split + 1][last]
                            + (long) dimensions[first - 1] * dimensions[split] * dimensions[last];
                    dp[first][last] = Math.min(dp[first][last], cost);
                }
            }
        }
        return dp[1][matrices];
    }

    public static void main(String[] args) {
        int[] dimensions = {1, 2, 3, 4, 3};
        System.out.println("Minimum multiplication cost: " + minimumCost(dimensions));
    }
}
