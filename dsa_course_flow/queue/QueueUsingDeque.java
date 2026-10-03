package queue;

import java.util.ArrayDeque;

public class QueueUsingDeque {
	public static void main(String[] args) {
		java.util.Deque<Integer> queue = new ArrayDeque<>();
		queue.addLast(10);
		queue.addLast(20);
		queue.addLast(30);

		System.out.println("Queue = " + queue);
		System.out.println("Front = " + queue.getFirst());
		System.out.println("Removed = " + queue.removeFirst());
	}
}
