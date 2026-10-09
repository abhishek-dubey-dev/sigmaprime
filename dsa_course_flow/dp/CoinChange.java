package dp;

public class CoinChange {
    public static long countWays(int[] coins, int sum) {
        if (coins == null || sum < 0) {
            throw new IllegalArgumentException("coins must not be null and sum must be non-negative");
        }
        long[] dp = new long[sum + 1];
        dp[0] = 1;
        for (int coin : coins) {
            if (coin <= 0) {
                throw new IllegalArgumentException("coin values must be positive");
            }
            for (int amount = coin; amount <= sum; amount++) {
                dp[amount] += dp[amount - coin];
            }
        }
        return dp[sum];
    }

    public static void main(String[] args) {
        int[] coins = {2, 5, 3, 6};
        System.out.println("Ways to make 10: " + countWays(coins, 10));
    }
}
