package greedy;

import java.util.Arrays;

public class MinimumSumAbsoluteDifferencePairs {
    public static long minimumSum(int[] first, int[] second) {
        Arrays.sort(first);
        Arrays.sort(second);

        long sum = 0;
        for (int i = 0; i < first.length; i++) {
            sum += Math.abs((long) first[i] - second[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] first = {4, 1, 8, 7};
        int[] second = {2, 3, 6, 5};
        System.out.println("Minimum sum: " + minimumSum(first, second));
    }
}
