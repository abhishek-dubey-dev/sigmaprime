package dp;

public class ClimbingStairsTabulation {
    public static long countWays(int stairs) {
        if (stairs < 0) {
            return 0;
        }
        if (stairs <= 1) {
            return 1;
        }

        long[] dp = new long[stairs + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int step = 2; step <= stairs; step++) {
            dp[step] = dp[step - 1] + dp[step - 2];
        }
        return dp[stairs];
    }

    public static void main(String[] args) {
        System.out.println("Ways to climb 5 stairs: " + countWays(5));
    }
}
