package stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackUsingArrayList {
	private final ArrayList<Integer> values = new ArrayList<>();

	public void push(int value) {
		values.add(value);
	}

	public int pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return values.remove(values.size() - 1);
	}

	public int peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return values.get(values.size() - 1);
	}

	public boolean isEmpty() {
		return values.isEmpty();
	}

	public int size() {
		return values.size();
	}

	public void print() {
		System.out.println(values);
	}

	public static void main(String[] args) {
		StackUsingArrayList values = new StackUsingArrayList();
		values.push(10);
		values.push(20);
		values.push(30);
		values.print();
		System.out.println("Top = " + values.peek());
		System.out.println("Removed = " + values.pop());
		System.out.println("Size = " + values.size());
	}
}
