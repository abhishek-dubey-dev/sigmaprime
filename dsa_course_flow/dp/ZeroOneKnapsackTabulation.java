package dp;

public class ZeroOneKnapsackTabulation {
    public static int maximumProfit(int[] values, int[] weights, int capacity) {
        ZeroOneKnapsackMemoization.validate(values, weights, capacity);
        int[][] dp = new int[values.length + 1][capacity + 1];
        for (int itemCount = 1; itemCount <= values.length; itemCount++) {
            for (int currentCapacity = 1; currentCapacity <= capacity; currentCapacity++) {
                int skip = dp[itemCount - 1][currentCapacity];
                int take = 0;
                if (weights[itemCount - 1] <= currentCapacity) {
                    take = values[itemCount - 1]
                            + dp[itemCount - 1][currentCapacity - weights[itemCount - 1]];
                }
                dp[itemCount][currentCapacity] = Math.max(skip, take);
            }
        }
        return dp[values.length][capacity];
    }

    public static void main(String[] args) {
        int[] values = {15, 14, 10, 45, 30};
        int[] weights = {2, 5, 1, 3, 4};
        System.out.println("Maximum profit: " + maximumProfit(values, weights, 7));
    }
}
