package array_list;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(1);
		numbers.add(4);
		numbers.add(2);

		Collections.sort(numbers);
		System.out.println("Ascending: " + numbers);

		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println("Descending: " + numbers);
	}
}
