package array_list;

import java.util.ArrayList;

public class MultiDimensionalArrayList {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> rows = new ArrayList<>();

		ArrayList<Integer> firstRow = new ArrayList<>();
		firstRow.add(1);
		firstRow.add(2);
		firstRow.add(3);

		ArrayList<Integer> secondRow = new ArrayList<>();
		secondRow.add(4);
		secondRow.add(5);
		secondRow.add(6);

		rows.add(firstRow);
		rows.add(secondRow);

		for (ArrayList<Integer> row : rows) {
			System.out.println(row);
		}
	}
}
