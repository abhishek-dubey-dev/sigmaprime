package dp;

public class MinimumArrayJumps {
    public static int minimumJumps(int[] jumps) {
        if (jumps == null) {
            throw new IllegalArgumentException("jumps must not be null");
        }
        if (jumps.length <= 1) {
            return 0;
        }
        for (int jump : jumps) {
            if (jump < 0) {
                throw new IllegalArgumentException("jump lengths must be non-negative");
            }
        }

        int[] dp = new int[jumps.length];
        java.util.Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < jumps.length - 1; i++) {
            if (dp[i] == Integer.MAX_VALUE) {
                continue;
            }
            int furthest = (int) Math.min(jumps.length - 1L, (long) i + jumps[i]);
            for (int next = i + 1; next <= furthest; next++) {
                dp[next] = Math.min(dp[next], dp[i] + 1);
            }
        }
        return dp[jumps.length - 1] == Integer.MAX_VALUE ? -1 : dp[jumps.length - 1];
    }

    public static void main(String[] args) {
        int[] jumps = {2, 3, 1, 1, 4};
        System.out.println("Minimum jumps: " + minimumJumps(jumps));
    }
}
