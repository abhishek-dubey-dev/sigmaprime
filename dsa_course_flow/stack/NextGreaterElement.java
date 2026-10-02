package stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
	public static int[] findNextGreaterElements(int[] values) {
		int[] result = new int[values.length];
		Stack<Integer> indices = new Stack<>();

		for (int index = values.length - 1; index >= 0; index--) {
			while (!indices.isEmpty() && values[indices.peek()] <= values[index]) {
				indices.pop();
			}
			result[index] = indices.isEmpty() ? -1 : values[indices.peek()];
			indices.push(index);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] values = {6, 8, 0, 1, 3};
		System.out.println(Arrays.toString(findNextGreaterElements(values)));
	}
}
