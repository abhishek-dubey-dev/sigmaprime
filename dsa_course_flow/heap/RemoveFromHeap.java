package heap;

import java.util.PriorityQueue;

public class RemoveFromHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int value : new int[]{8, 3, 10, 1, 6, 14}) {
            minHeap.offer(value);
        }

        System.out.println("Before removal: " + minHeap);
        System.out.println("Removed smallest: " + minHeap.poll());
        System.out.println("After removal: " + minHeap);
    }
}
