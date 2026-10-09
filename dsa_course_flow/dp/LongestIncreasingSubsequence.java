package dp;

public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("numbers must not be null");
        }
        if (numbers.length == 0) {
            return 0;
        }

        int[] dp = new int[numbers.length];
        java.util.Arrays.fill(dp, 1);
        int longest = 1;
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] < numbers[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            longest = Math.max(longest, dp[i]);
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] numbers = {50, 3, 10, 7, 40, 80};
        System.out.println("LIS length: " + lengthOfLIS(numbers));
    }
}
