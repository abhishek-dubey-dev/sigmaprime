package stack;

import java.util.Stack;

public class StackUsingCollectionFramework {
	public static void main(String[] args) {
		Stack<Integer> values = new Stack<>();
		values.push(10);
		values.push(20);
		values.push(30);

		System.out.println("Stack: " + values);
		System.out.println("Top = " + values.peek());
		System.out.println("Removed = " + values.pop());
		System.out.println("After pop: " + values);
		System.out.println("Empty = " + values.isEmpty());
	}
}
