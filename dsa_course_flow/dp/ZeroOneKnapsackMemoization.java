package dp;

public class ZeroOneKnapsackMemoization {
    public static int maximumProfit(int[] values, int[] weights, int capacity) {
        validate(values, weights, capacity);
        int[][] memo = new int[values.length + 1][capacity + 1];
        for (int[] row : memo) {
            java.util.Arrays.fill(row, -1);
        }
        return maximumProfit(values, weights, values.length, capacity, memo);
    }

    private static int maximumProfit(int[] values, int[] weights, int itemCount,
                                     int capacity, int[][] memo) {
        if (itemCount == 0 || capacity == 0) {
            return 0;
        }
        if (memo[itemCount][capacity] != -1) {
            return memo[itemCount][capacity];
        }
        int best = maximumProfit(values, weights, itemCount - 1, capacity, memo);
        if (weights[itemCount - 1] <= capacity) {
            best = Math.max(best, values[itemCount - 1]
                    + maximumProfit(values, weights, itemCount - 1,
                            capacity - weights[itemCount - 1], memo));
        }
        memo[itemCount][capacity] = best;
        return best;
    }

    static void validate(int[] values, int[] weights, int capacity) {
        if (values == null || weights == null || values.length != weights.length || capacity < 0) {
            throw new IllegalArgumentException("values and weights must match and capacity must be non-negative");
        }
        for (int weight : weights) {
            if (weight <= 0) {
                throw new IllegalArgumentException("weights must be positive");
            }
        }
    }

    public static void main(String[] args) {
        int[] values = {15, 14, 10, 45, 30};
        int[] weights = {2, 5, 1, 3, 4};
        System.out.println("Maximum profit: " + maximumProfit(values, weights, 7));
    }
}
