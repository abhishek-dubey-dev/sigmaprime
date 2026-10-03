package queue;

import java.util.ArrayDeque;

public class DequeUsingJCF {
	public static void main(String[] args) {
		java.util.Deque<Integer> deque = new ArrayDeque<>();
		deque.addFirst(20);
		deque.addFirst(10);
		deque.addLast(30);

		System.out.println("Deque = " + deque);
		System.out.println("Removed from front = " + deque.removeFirst());
		System.out.println("Removed from rear = " + deque.removeLast());
	}
}
