package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class QueueReversal {
	public static <T> Queue<T> reverse(Queue<T> values) {
		Objects.requireNonNull(values, "Queue must not be null");
		Deque<T> stack = new ArrayDeque<>();
		while (!values.isEmpty()) {
			stack.push(values.remove());
		}
		while (!stack.isEmpty()) {
			values.add(stack.pop());
		}
		return values;
	}

	public static void main(String[] args) {
		Queue<Integer> values = new LinkedList<>();
		values.add(1);
		values.add(2);
		values.add(3);
		System.out.println("Before reversing: " + values);
		reverse(values);
		System.out.println("After reversing: " + values);
	}
}
