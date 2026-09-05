package array_list;

import java.util.ArrayList;

public class ArrayListOperation {
    public static void main(String[] args) {

        ArrayList<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(2, 10);
        integerList.set(0, 100);
        integerList.remove(Integer.valueOf(3));

        System.out.println("ArrayList: " + integerList);
        System.out.println("Contains 10: " + integerList.contains(10));
        System.out.println("Element at index 1: " + integerList.get(1));
    }
}
