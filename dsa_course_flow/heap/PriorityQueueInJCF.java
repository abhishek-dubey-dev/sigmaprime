package heap;

import java.util.PriorityQueue;

public class PriorityQueueInJCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int[] values = {15, 5, 20, 1, 10, 30};
        for (int value : values) {
            minHeap.offer(value);
            System.out.println("Inserted: " + value + " | Heap: " + minHeap);
        }

        System.out.println("Peek: " + minHeap.peek());
        System.out.println("Poll: " + minHeap.poll());
        System.out.println("After poll: " + minHeap);
    }
}
