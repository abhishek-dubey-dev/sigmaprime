package dp;

public class UnboundedKnapsackTabulation {
    public static int maximumProfit(int[] values, int[] weights, int capacity) {
        if (values == null || weights == null || values.length != weights.length || capacity < 0) {
            throw new IllegalArgumentException("values and weights must match and capacity must be non-negative");
        }
        int[] dp = new int[capacity + 1];
        for (int item = 0; item < values.length; item++) {
            if (weights[item] <= 0) {
                throw new IllegalArgumentException("weights must be positive");
            }
            for (int currentCapacity = weights[item]; currentCapacity <= capacity; currentCapacity++) {
                dp[currentCapacity] = Math.max(dp[currentCapacity],
                        dp[currentCapacity - weights[item]] + values[item]);
            }
        }
        return dp[capacity];
    }

    public static void main(String[] args) {
        int[] values = {15, 14, 10, 45, 30};
        int[] weights = {2, 5, 1, 3, 4};
        System.out.println("Maximum profit: " + maximumProfit(values, weights, 7));
    }
}
