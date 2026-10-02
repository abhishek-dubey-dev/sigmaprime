package stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {
	public static int[] calculateSpan(int[] prices) {
		int[] spans = new int[prices.length];
		Stack<Integer> indices = new Stack<>();

		for (int index = 0; index < prices.length; index++) {
			while (!indices.isEmpty() && prices[indices.peek()] <= prices[index]) {
				indices.pop();
			}
			spans[index] = indices.isEmpty() ? index + 1 : index - indices.peek();
			indices.push(index);
		}

		return spans;
	}

	public static void main(String[] args) {
		int[] prices = {100, 80, 60, 70, 60, 85, 100};
		System.out.println(Arrays.toString(calculateSpan(prices)));
	}
}
