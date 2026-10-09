package dp;

public class ClimbingStairsMemoization {
    public static long countWays(int stairs) {
        if (stairs < 0) {
            return 0;
        }
        long[] memo = new long[stairs + 1];
        java.util.Arrays.fill(memo, -1);
        return countWays(stairs, memo);
    }

    private static long countWays(int stairs, long[] memo) {
        if (stairs <= 1) {
            return 1;
        }
        if (memo[stairs] != -1) {
            return memo[stairs];
        }
        memo[stairs] = countWays(stairs - 1, memo) + countWays(stairs - 2, memo);
        return memo[stairs];
    }

    public static void main(String[] args) {
        System.out.println("Ways to climb 5 stairs: " + countWays(5));
    }
}
