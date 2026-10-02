package stack;

import java.util.EmptyStackException;

public class StackUsingLinkedList {
	private static class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node top;
	private int size;

	public void push(int value) {
		top = new Node(value, top);
		size++;
	}

	public int pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		int value = top.data;
		top = top.next;
		size--;
		return value;
	}

	public int peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public int size() {
		return size;
	}

	public void print() {
		Node current = top;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public static void main(String[] args) {
		StackUsingLinkedList values = new StackUsingLinkedList();
		values.push(10);
		values.push(20);
		values.push(30);
		System.out.println("Stack from top:");
		values.print();
		System.out.println("Top = " + values.peek());
		System.out.println("Removed = " + values.pop());
		System.out.println("Size = " + values.size());
	}
}
