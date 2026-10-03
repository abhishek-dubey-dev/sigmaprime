package queue;

import java.util.ArrayDeque;

public class StackUsingDeque {
	public static void main(String[] args) {
		java.util.Deque<Integer> stack = new ArrayDeque<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println("Stack = " + stack);
		System.out.println("Top = " + stack.peek());
		System.out.println("Removed = " + stack.pop());
	}
}
