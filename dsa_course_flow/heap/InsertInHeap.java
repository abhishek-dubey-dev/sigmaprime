package heap;

import java.util.PriorityQueue;

public class InsertInHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int[] values = {10, 15, 30, 5, 20, 25};
        for (int value : values) {
            minHeap.offer(value);
            System.out.println("Inserted " + value + ", heap: " + minHeap);
        }
    }
}
