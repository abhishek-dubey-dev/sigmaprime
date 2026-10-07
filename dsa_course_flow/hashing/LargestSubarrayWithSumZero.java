/* public class LargestSubarrayWithSumZero {
    public static int largestSubarrayLengthWithSumZero(int[] values) {
        if (values == null) {
            throw new IllegalArgumentException("values must not be null");
        }

        java.util.Map<Long, Integer> firstIndexByPrefixSum = new java.util.HashMap<>();
        long prefixSum = 0;
        int largestLength = 0;
        for (int index = 0; index < values.length; index++) {
            prefixSum += values[index];
            if (prefixSum == 0) {
                largestLength = index + 1;
            } else if (firstIndexByPrefixSum.containsKey(prefixSum)) {
                largestLength = Math.max(largestLength,
                        index - firstIndexByPrefixSum.get(prefixSum));
            } else {
                firstIndexByPrefixSum.put(prefixSum, index);
            }
        }
        return largestLength;
    }

    public static void main(String[] args) {
        int[] values = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println("Largest zero-sum subarray length: "
                + largestSubarrayLengthWithSumZero(values));
    }
} */

    import java.util.HashMap;

public class LargestSubarrayWithSumZero {

    public static int largestSubarray(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // Sum becomes zero
            if (sum == 0) {
                maxLength = i + 1;
            }

            // Same prefix sum already exists
            if (map.containsKey(sum)) {

                int previousIndex = map.get(sum);

                maxLength = Math.max(
                        maxLength,
                        i - previousIndex
                );

            } else {

                // Store first occurrence only
                map.put(sum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] arr = {
                15, -2, 2, -8, 1, 7, 10, 23
        };

        System.out.println(
                "Largest Subarray Length: "
                        + largestSubarray(arr)
        );
    }
}
