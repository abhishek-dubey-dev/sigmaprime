package stack;

import java.util.Stack;

public class PushAtBottomOfStack {
	public static void pushAtBottom(Stack<Integer> values, int value) {
		if (values.isEmpty()) {
			values.push(value);
			return;
		}

		int top = values.pop();
		pushAtBottom(values, value);
		values.push(top);
	}

	public static void main(String[] args) {
		Stack<Integer> values = new Stack<>();
		values.push(1);
		values.push(2);
		values.push(3);

		pushAtBottom(values, 0);
		System.out.println(values);
	}
}
