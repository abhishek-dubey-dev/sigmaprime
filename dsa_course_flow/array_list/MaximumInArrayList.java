package array_list;

import java.util.ArrayList;

public class MaximumInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(7);
        numbers.add(42);

        int maximum = numbers.get(0);
        for (int index = 1; index < numbers.size(); index++) {
            maximum = Math.max(maximum, numbers.get(index));
        }

        System.out.println("Maximum: " + maximum);
    }
}
