package dp;

public class MinimumPartitioning {
    public static int minimumDifference(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("numbers must not be null");
        }
        int total = 0;
        for (int number : numbers) {
            if (number < 0) {
                throw new IllegalArgumentException("numbers must be non-negative");
            }
            total = Math.addExact(total, number);
        }

        boolean[] possible = new boolean[total / 2 + 1];
        possible[0] = true;
        for (int number : numbers) {
            for (int sum = possible.length - 1; sum >= number; sum--) {
                possible[sum] |= possible[sum - number];
            }
        }
        for (int firstPartition = possible.length - 1; firstPartition >= 0; firstPartition--) {
            if (possible[firstPartition]) {
                return total - 2 * firstPartition;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 6, 11, 5};
        System.out.println("Minimum partition difference: " + minimumDifference(numbers));
    }
}
