package heap;

import java.util.PriorityQueue;

public class ConnectNRopesWithMinimumCost {
    public static int minCostToConnectRopes(int[] ropes) {
        if (ropes == null || ropes.length <= 1) {
            return 0;
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int rope : ropes) {
            minHeap.offer(rope);
        }

        int totalCost = 0;
        while (minHeap.size() > 1) {
            int first = minHeap.poll();
            int second = minHeap.poll();
            int mergedCost = first + second;
            totalCost += mergedCost;
            minHeap.offer(mergedCost);
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[] ropes = {4, 3, 2, 6};
        System.out.println("Minimum cost: " + minCostToConnectRopes(ropes));
    }
}
