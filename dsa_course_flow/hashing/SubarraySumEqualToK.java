/* public class SubarraySumEqualToK {
    public static long countSubarraysWithSum(int[] values, long target) {
        if (values == null) {
            throw new IllegalArgumentException("values must not be null");
        }

        java.util.Map<Long, Long> prefixSumFrequencies = new java.util.HashMap<>();
        prefixSumFrequencies.put(0L, 1L);
        long prefixSum = 0;
        long count = 0;
        for (int value : values) {
            prefixSum += value;
            count += prefixSumFrequencies.getOrDefault(prefixSum - target, 0L);
            prefixSumFrequencies.put(prefixSum,
                    prefixSumFrequencies.getOrDefault(prefixSum, 0L) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] values = {10, 2, -2, -20, 10};
        long target = -10;
        System.out.println("Subarrays with sum " + target + ": "
                + countSubarraysWithSum(values, target));
    }
} */

    import java.util.HashMap;

public class SubarraySumEqualToK {

    public static int countSubarrays(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 occurs once
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : arr) {

            prefixSum += num;

            /*
             * We need:
             *
             * prefixSum - previousPrefix = k
             *
             * Therefore:
             *
             * previousPrefix = prefixSum - k
             */

            if (map.containsKey(prefixSum - k)) {

                count += map.get(prefixSum - k);
            }

            // Store prefix sum frequency
            map.put(
                    prefixSum,
                    map.getOrDefault(prefixSum, 0) + 1
            );
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {
                1, 2, 3
        };

        int k = 3;

        System.out.println(
                "Number of Subarrays: "
                        + countSubarrays(arr, k)
        );
    }
}
