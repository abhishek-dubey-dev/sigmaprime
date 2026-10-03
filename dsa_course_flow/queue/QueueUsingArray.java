package queue;

public class QueueUsingArray {
	private static final int[] queue = new int[5];
	private static int front;
	private static int rear = -1;

	public static void add(int value) {
		if (rear == queue.length - 1) {
			throw new IllegalStateException("Queue is full");
		}
		queue[++rear] = value;
	}

	public static int remove() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		return queue[front++];
	}

	public static int peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		return queue[front];
	}

	public static boolean isEmpty() {
		return front > rear;
	}

	public static void main(String[] args) {
		add(10);
		add(20);
		add(30);
		System.out.println("Front = " + peek());
		System.out.println("Removed = " + remove());
		System.out.println("Removed = " + remove());
	}
}
