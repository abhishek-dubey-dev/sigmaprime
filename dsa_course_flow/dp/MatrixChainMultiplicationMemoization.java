package dp;

public class MatrixChainMultiplicationMemoization {
    public static long minimumCost(int[] dimensions) {
        validateDimensions(dimensions);
        int matrices = dimensions.length - 1;
        long[][] memo = new long[matrices + 1][matrices + 1];
        for (long[] row : memo) {
            java.util.Arrays.fill(row, -1);
        }
        return minimumCost(dimensions, 1, matrices, memo);
    }

    private static long minimumCost(int[] dimensions, int first, int last, long[][] memo) {
        if (first >= last) {
            return 0;
        }
        if (memo[first][last] != -1) {
            return memo[first][last];
        }

        long best = Long.MAX_VALUE;
        for (int split = first; split < last; split++) {
            long cost = minimumCost(dimensions, first, split, memo)
                    + minimumCost(dimensions, split + 1, last, memo)
                    + (long) dimensions[first - 1] * dimensions[split] * dimensions[last];
            best = Math.min(best, cost);
        }
        memo[first][last] = best;
        return best;
    }

    static void validateDimensions(int[] dimensions) {
        if (dimensions == null || dimensions.length < 2) {
            throw new IllegalArgumentException("at least two dimensions are required");
        }
        for (int dimension : dimensions) {
            if (dimension <= 0) {
                throw new IllegalArgumentException("dimensions must be positive");
            }
        }
    }

    public static void main(String[] args) {
        int[] dimensions = {1, 2, 3, 4, 3};
        System.out.println("Minimum multiplication cost: " + minimumCost(dimensions));
    }
}
