package array_list;

import java.util.ArrayList;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);

		int temporary = numbers.get(0);
		numbers.set(0, numbers.get(1));
		numbers.set(1, temporary);

		System.out.println("After swapping: " + numbers);
	}
}
