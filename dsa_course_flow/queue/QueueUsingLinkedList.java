package queue;

import java.util.NoSuchElementException;

public class QueueUsingLinkedList {
	private static class Node {
		private final int value;
		private Node next;

		private Node(int value) {
			this.value = value;
		}
	}

	private Node front;
	private Node rear;
	private int size;

	public void enqueue(int value) {
		Node node = new Node(value);
		if (rear == null) {
			front = node;
		} else {
			rear.next = node;
		}
		rear = node;
		size++;
	}

	public int dequeue() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is empty");
		}
		int value = front.value;
		front = front.next;
		if (front == null) {
			rear = null;
		}
		size--;
		return value;
	}

	public int peek() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is empty");
		}
		return front.value;
	}

	public boolean isEmpty() {
		return front == null;
	}

	public int size() {
		return size;
	}

	public void print() {
		Node current = front;
		while (current != null) {
			System.out.print(current.value + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.print();
		System.out.println("Removed = " + queue.dequeue());
		queue.print();
	}
}
