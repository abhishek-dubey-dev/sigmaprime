package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class QueueUsingTwoStacks {
	private final Deque<Integer> incoming = new ArrayDeque<>();
	private final Deque<Integer> outgoing = new ArrayDeque<>();

	public void enqueue(int value) {
		incoming.push(value);
	}

	public int dequeue() {
		moveIncomingIfNeeded();
		if (outgoing.isEmpty()) {
			throw new NoSuchElementException("Queue is empty");
		}
		return outgoing.pop();
	}

	public int peek() {
		moveIncomingIfNeeded();
		if (outgoing.isEmpty()) {
			throw new NoSuchElementException("Queue is empty");
		}
		return outgoing.peek();
	}

	private void moveIncomingIfNeeded() {
		if (outgoing.isEmpty()) {
			while (!incoming.isEmpty()) {
				outgoing.push(incoming.pop());
			}
		}
	}

	public boolean isEmpty() {
		return incoming.isEmpty() && outgoing.isEmpty();
	}

	public int size() {
		return incoming.size() + outgoing.size();
	}

	public static void main(String[] args) {
		QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		System.out.println("Front = " + queue.peek());
		System.out.println("Removed = " + queue.dequeue());
		queue.enqueue(40);
		System.out.println("Removed = " + queue.dequeue());
	}
}
