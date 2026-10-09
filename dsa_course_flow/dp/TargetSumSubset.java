package dp;

public class TargetSumSubset {
    public static boolean isSubsetSum(int[] numbers, int target) {
        if (numbers == null || target < 0) {
            throw new IllegalArgumentException("numbers must not be null and target must be non-negative");
        }
        boolean[] possible = new boolean[target + 1];
        possible[0] = true;
        for (int number : numbers) {
            if (number < 0) {
                throw new IllegalArgumentException("numbers must be non-negative");
            }
            for (int sum = target; sum >= number; sum--) {
                possible[sum] |= possible[sum - number];
            }
        }
        return possible[target];
    }

    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 1, 3};
        System.out.println("Subset with sum 10 exists: " + isSubsetSum(numbers, 10));
    }
}
