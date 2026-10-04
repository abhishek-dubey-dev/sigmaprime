package greedy;

import java.util.Arrays;

public class ChocolaProblem {
    public static long minimumCost(int[] horizontal, int[] vertical) {
        Arrays.sort(horizontal);
        Arrays.sort(vertical);

        int h = horizontal.length - 1;
        int v = vertical.length - 1;
        int horizontalPieces = 1;
        int verticalPieces = 1;
        long cost = 0;

        while (h >= 0 && v >= 0) {
            if (horizontal[h] > vertical[v]) {
                cost += (long) horizontal[h--] * verticalPieces;
                horizontalPieces++;
            } else {
                cost += (long) vertical[v--] * horizontalPieces;
                verticalPieces++;
            }
        }
        while (h >= 0) {
            cost += (long) horizontal[h--] * verticalPieces;
        }
        while (v >= 0) {
            cost += (long) vertical[v--] * horizontalPieces;
        }
        return cost;
    }

    public static void main(String[] args) {
        int[] horizontal = {4, 1, 2};
        int[] vertical = {2, 1, 3, 1, 4};
        System.out.println("Minimum cutting cost: " + minimumCost(horizontal, vertical));
    }
}
