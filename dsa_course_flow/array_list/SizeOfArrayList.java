package array_list;

import java.util.ArrayList;

public class SizeOfArrayList {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Aman");
		names.add("Riya");
		names.add("Kabir");

		System.out.println("ArrayList: " + names);
		System.out.println("Size: " + names.size());
	}
}
