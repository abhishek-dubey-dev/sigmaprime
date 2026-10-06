package heap;

import java.util.PriorityQueue;

public class PeekFromHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(20);
        minHeap.offer(10);
        minHeap.offer(30);
        minHeap.offer(5);

        System.out.println("Top element: " + minHeap.peek());
        System.out.println("Heap: " + minHeap);
    }
}
