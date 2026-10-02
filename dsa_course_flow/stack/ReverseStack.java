package stack;

import java.util.Stack;

public class ReverseStack {
	public static void reverse(Stack<Integer> values) {
		if (values.isEmpty()) {
			return;
		}

		int top = values.pop();
		reverse(values);
		PushAtBottomOfStack.pushAtBottom(values, top);
	}

	public static void main(String[] args) {
		Stack<Integer> values = new Stack<>();
		values.push(1);
		values.push(2);
		values.push(3);

		System.out.println("Before reversing: " + values);
		reverse(values);
		System.out.println("After reversing: " + values);
	}
}
