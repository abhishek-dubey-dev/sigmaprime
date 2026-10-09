package dp;

public class RodCutting {
    public static int maximumProfit(int[] lengths, int[] prices, int rodLength) {
        if (lengths == null || prices == null || lengths.length != prices.length || rodLength < 0) {
            throw new IllegalArgumentException("lengths and prices must match and rodLength must be non-negative");
        }
        int[] dp = new int[rodLength + 1];
        for (int piece = 0; piece < lengths.length; piece++) {
            if (lengths[piece] <= 0) {
                throw new IllegalArgumentException("piece lengths must be positive");
            }
            for (int available = lengths[piece]; available <= rodLength; available++) {
                dp[available] = Math.max(dp[available],
                        dp[available - lengths[piece]] + prices[piece]);
            }
        }
        return dp[rodLength];
    }

    public static void main(String[] args) {
        int[] lengths = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] prices = {1, 5, 8, 9, 10, 17, 17, 20};
        System.out.println("Maximum rod-cutting profit: " + maximumProfit(lengths, prices, 8));
    }
}
