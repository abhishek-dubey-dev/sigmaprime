/* public class UnionAndIntersectionOfArray {
    public static java.util.Set<Integer> union(int[] first, int[] second) {
        validateArrays(first, second);
        java.util.Set<Integer> result = new java.util.LinkedHashSet<>();
        for (int value : first) {
            result.add(value);
        }
        for (int value : second) {
            result.add(value);
        }
        return result;
    }

    public static java.util.Set<Integer> intersection(int[] first, int[] second) {
        validateArrays(first, second);
        java.util.Set<Integer> secondValues = new java.util.HashSet<>();
        for (int value : second) {
            secondValues.add(value);
        }

        java.util.Set<Integer> result = new java.util.LinkedHashSet<>();
        for (int value : first) {
            if (secondValues.contains(value)) {
                result.add(value);
            }
        }
        return result;
    }

    private static void validateArrays(int[] first, int[] second) {
        if (first == null || second == null) {
            throw new IllegalArgumentException("arrays must not be null");
        }
    }

    public static void main(String[] args) {
        int[] first = {7, 3, 9, 2, 7};
        int[] second = {6, 3, 9, 8};
        System.out.println("Union: " + union(first, second));
        System.out.println("Intersection: " + intersection(first, second));
    }
}
 */

import java.util.HashSet;

public class UnionAndIntersectionOfArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7};

        // UNION
        HashSet<Integer> union = new HashSet<>();

        for (int num : arr1) {
            union.add(num);
        }

        for (int num : arr2) {
            union.add(num);
        }

        System.out.println(
                "Union: " + union
        );

        // INTERSECTION
        HashSet<Integer> set1 = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        HashSet<Integer> intersection = new HashSet<>();

        for (int num : arr2) {

            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        System.out.println(
                "Intersection: " + intersection
        );
    }
}