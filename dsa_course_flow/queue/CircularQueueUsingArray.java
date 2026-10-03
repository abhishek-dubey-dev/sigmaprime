package queue;

public class CircularQueueUsingArray {
	private static final int[] queue = new int[5];
	private static int front = -1;
	private static int rear = -1;

	public static void add(int value) {
		if ((rear + 1) % queue.length == front) {
			throw new IllegalStateException("Queue is full");
		}
		if (front == -1) {
			front = 0;
		}
		rear = (rear + 1) % queue.length;
		queue[rear] = value;
	}

	public static int remove() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		int value = queue[front];
		if (front == rear) {
			front = -1;
			rear = -1;
		} else {
			front = (front + 1) % queue.length;
		}
		return value;
	}

	public static int peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		return queue[front];
	}

	public static boolean isEmpty() {
		return front == -1;
	}

	public static void main(String[] args) {
		add(10);
		add(20);
		add(30);
		System.out.println("Removed = " + remove());
		add(40);
		System.out.println("Front = " + peek());
	}
}
