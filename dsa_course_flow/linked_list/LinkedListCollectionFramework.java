package linked_list;

import java.util.LinkedList;

public class LinkedListCollectionFramework {
	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<>();

		numbers.add(10);
		numbers.add(20);
		numbers.addFirst(5);
		numbers.addLast(30);
		System.out.println("Linked list: " + numbers);
		System.out.println("First element = " + numbers.getFirst());
		System.out.println("Last element = " + numbers.getLast());

		numbers.removeFirst();
		numbers.removeLast();
		System.out.println("After removing first and last: " + numbers);
	}
}
