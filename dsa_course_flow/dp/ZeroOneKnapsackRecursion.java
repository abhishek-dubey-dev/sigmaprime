package dp;

public class ZeroOneKnapsackRecursion {
    public static int maximumProfit(int[] values, int[] weights, int capacity) {
        ZeroOneKnapsackMemoization.validate(values, weights, capacity);
        return maximumProfit(values, weights, values.length, capacity);
    }

    private static int maximumProfit(int[] values, int[] weights, int itemCount, int capacity) {
        if (itemCount == 0 || capacity == 0) {
            return 0;
        }
        int best = maximumProfit(values, weights, itemCount - 1, capacity);
        if (weights[itemCount - 1] <= capacity) {
            best = Math.max(best, values[itemCount - 1]
                    + maximumProfit(values, weights, itemCount - 1,
                            capacity - weights[itemCount - 1]));
        }
        return best;
    }

    public static void main(String[] args) {
        int[] values = {15, 14, 10, 45, 30};
        int[] weights = {2, 5, 1, 3, 4};
        System.out.println("Maximum profit: " + maximumProfit(values, weights, 7));
    }
}
