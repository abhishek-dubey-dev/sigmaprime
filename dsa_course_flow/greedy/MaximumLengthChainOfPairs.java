package greedy;

public class MaximumLengthChainOfPairs {
    public static int maximumChainLength(int[][] pairs) {
        // Sort pairs by their ending value.
        for (int i = 0; i < pairs.length; i++) {
            for (int j = i + 1; j < pairs.length; j++) {
                if (pairs[i][1] > pairs[j][1]) {
                    int[] temp = pairs[i];
                    pairs[i] = pairs[j];
                    pairs[j] = temp;
                }
            }
        }

        if (pairs.length == 0) {
            return 0;
        }
        int count = 1;
        int lastEnd = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > lastEnd) {
                count++;
                lastEnd = pairs[i][1];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] pairs = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};
        System.out.println("Maximum chain length: " + maximumChainLength(pairs));
    }
}
