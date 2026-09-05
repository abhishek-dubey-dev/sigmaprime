package array_list;

import java.util.ArrayList;

public class ReverseArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);

		for (int left = 0, right = numbers.size() - 1; left < right; left++, right--) {
			int temporary = numbers.get(left);
			numbers.set(left, numbers.get(right));
			numbers.set(right, temporary);
		}

		System.out.println("Reversed: " + numbers);
	}
}
