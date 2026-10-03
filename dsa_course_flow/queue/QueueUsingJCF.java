package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingJCF {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);

		System.out.println("Queue = " + queue);
		System.out.println("Front = " + queue.peek());
		System.out.println("Removed = " + queue.remove());
		System.out.println("Queue = " + queue);
	}
}
