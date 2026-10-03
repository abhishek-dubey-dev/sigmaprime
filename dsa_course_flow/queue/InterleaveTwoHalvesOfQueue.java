package queue;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class InterleaveTwoHalvesOfQueue {
	public static <T> Queue<T> interleave(Queue<T> values) {
		Objects.requireNonNull(values, "Queue must not be null");
		if (values.size() % 2 != 0) {
			throw new IllegalArgumentException("Queue must contain an even number of elements");
		}

		int halfSize = values.size() / 2;
		Queue<T> firstHalf = new LinkedList<>();
		for (int i = 0; i < halfSize; i++) {
			firstHalf.add(values.remove());
		}

		while (!firstHalf.isEmpty()) {
			values.add(firstHalf.remove());
			values.add(values.remove());
		}
		return values;
	}

	public static void main(String[] args) {
		Queue<Integer> values = new LinkedList<>();
		for (int value = 1; value <= 6; value++) {
			values.add(value);
		}
		System.out.println("Before interleaving: " + values);
		interleave(values);
		System.out.println("After interleaving: " + values);
	}
}
