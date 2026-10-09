package dp;

public class MatrixChainMultiplicationRecursion {
    public static long minimumCost(int[] dimensions) {
        MatrixChainMultiplicationMemoization.validateDimensions(dimensions);
        return minimumCost(dimensions, 1, dimensions.length - 1);
    }

    private static long minimumCost(int[] dimensions, int first, int last) {
        if (first >= last) {
            return 0;
        }
        long best = Long.MAX_VALUE;
        for (int split = first; split < last; split++) {
            long cost = minimumCost(dimensions, first, split)
                    + minimumCost(dimensions, split + 1, last)
                    + (long) dimensions[first - 1] * dimensions[split] * dimensions[last];
            best = Math.min(best, cost);
        }
        return best;
    }

    public static void main(String[] args) {
        int[] dimensions = {1, 2, 3, 4, 3};
        System.out.println("Minimum multiplication cost: " + minimumCost(dimensions));
    }
}
