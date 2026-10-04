package greedy;

public class FractionalKnapsack {
    public static double maximumValue(int[] value, int[] weight, int capacity) {
        boolean[] picked = new boolean[value.length];
        double totalValue = 0;

        for (int item = 0; item < value.length && capacity > 0; item++) {
            int best = -1;
            for (int i = 0; i < value.length; i++) {
                if (!picked[i] && (best == -1
                        || (double) value[i] / weight[i] > (double) value[best] / weight[best])) {
                    best = i;
                }
            }

            picked[best] = true;
            if (weight[best] <= capacity) {
                totalValue += value[best];
                capacity -= weight[best];
            } else {
                totalValue += (double) value[best] * capacity / weight[best];
                capacity = 0;
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {
        int[] value = {60, 100, 120};
        int[] weight = {10, 20, 30};
        System.out.println("Maximum value: " + maximumValue(value, weight, 50));
    }
}
