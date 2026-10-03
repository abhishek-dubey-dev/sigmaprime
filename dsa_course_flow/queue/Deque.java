package queue;

import java.util.NoSuchElementException;

public class Deque {
	private static class Node {
		private final int value;
		private Node previous;
		private Node next;

		private Node(int value) {
			this.value = value;
		}
	}

	private Node front;
	private Node rear;
	private int size;

	public void addFirst(int value) {
		Node node = new Node(value);
		if (front == null) {
			front = node;
			rear = node;
		} else {
			node.next = front;
			front.previous = node;
			front = node;
		}
		size++;
	}

	public void addLast(int value) {
		Node node = new Node(value);
		if (rear == null) {
			front = node;
			rear = node;
		} else {
			rear.next = node;
			node.previous = rear;
			rear = node;
		}
		size++;
	}

	public int removeFirst() {
		if (isEmpty()) {
			throw new NoSuchElementException("Deque is empty");
		}
		int value = front.value;
		front = front.next;
		if (front == null) {
			rear = null;
		} else {
			front.previous = null;
		}
		size--;
		return value;
	}

	public int removeLast() {
		if (isEmpty()) {
			throw new NoSuchElementException("Deque is empty");
		}
		int value = rear.value;
		rear = rear.previous;
		if (rear == null) {
			front = null;
		} else {
			rear.next = null;
		}
		size--;
		return value;
	}

	public int peekFirst() {
		if (isEmpty()) {
			throw new NoSuchElementException("Deque is empty");
		}
		return front.value;
	}

	public int peekLast() {
		if (isEmpty()) {
			throw new NoSuchElementException("Deque is empty");
		}
		return rear.value;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		Deque values = new Deque();
		values.addFirst(20);
		values.addFirst(10);
		values.addLast(30);
		System.out.println("Front = " + values.peekFirst());
		System.out.println("Rear = " + values.peekLast());
		System.out.println("Removed from rear = " + values.removeLast());
		System.out.println("Size = " + values.size());
	}
}
