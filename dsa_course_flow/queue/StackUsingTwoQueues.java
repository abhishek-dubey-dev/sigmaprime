package queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class StackUsingTwoQueues {
	private Queue<Integer> primary = new LinkedList<>();
	private Queue<Integer> auxiliary = new LinkedList<>();

	public void push(int value) {
		auxiliary.add(value);
		while (!primary.isEmpty()) {
			auxiliary.add(primary.remove());
		}
		Queue<Integer> oldPrimary = primary;
		primary = auxiliary;
		auxiliary = oldPrimary;
	}

	public int pop() {
		if (isEmpty()) {
			throw new NoSuchElementException("Stack is empty");
		}
		return primary.remove();
	}

	public int peek() {
		if (isEmpty()) {
			throw new NoSuchElementException("Stack is empty");
		}
		return primary.element();
	}

	public boolean isEmpty() {
		return primary.isEmpty();
	}

	public int size() {
		return primary.size();
	}

	public static void main(String[] args) {
		StackUsingTwoQueues stack = new StackUsingTwoQueues();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("Top = " + stack.peek());
		System.out.println("Removed = " + stack.pop());
		System.out.println("Size = " + stack.size());
	}
}
