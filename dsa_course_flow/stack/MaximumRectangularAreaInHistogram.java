package stack;

import java.util.Stack;

public class MaximumRectangularAreaInHistogram {
	public static int maxArea(int[] heights) {
		Stack<Integer> indices = new Stack<>();
		int maximumArea = 0;

		for (int index = 0; index <= heights.length; index++) {
			int currentHeight = index == heights.length ? 0 : heights[index];

			while (!indices.isEmpty() && heights[indices.peek()] >= currentHeight) {
				int height = heights[indices.pop()];
				int leftSmallerIndex = indices.isEmpty() ? -1 : indices.peek();
				int width = index - leftSmallerIndex - 1;
				maximumArea = Math.max(maximumArea, height * width);
			}

			if (index < heights.length) {
				indices.push(index);
			}
		}

		return maximumArea;
	}

	public static void main(String[] args) {
		int[] heights = {2, 1, 5, 6, 2, 3};
		System.out.println("Maximum rectangular area = " + maxArea(heights));
	}
}
