package dp;

public class CatalanNumberRecursionMemoization {
    public static long catalan(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        long[] memo = new long[n + 1];
        java.util.Arrays.fill(memo, -1);
        return catalan(n, memo);
    }

    private static long catalan(int n, long[] memo) {
        if (n <= 1) {
            return 1;
        }
        if (memo[n] != -1) {
            return memo[n];
        }

        long count = 0;
        for (int left = 0; left < n; left++) {
            count += catalan(left, memo) * catalan(n - 1 - left, memo);
        }
        memo[n] = count;
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Catalan(4): " + catalan(4));
    }
}
