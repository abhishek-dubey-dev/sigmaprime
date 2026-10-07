/* public class CountDistinctElements {
    public static int countDistinct(int[] values) {
        if (values == null) {
            throw new IllegalArgumentException("values must not be null");
        }

        java.util.HashSet<Integer> distinct = new java.util.HashSet<>();
        for (int value : values) {
            distinct.add(value);
        }
        return distinct.size();
    }

    public static void main(String[] args) {
        int[] values = {4, 3, 2, 4, 1, 3, 5};
        System.out.println("Distinct element count: " + countDistinct(values));
    }
} */

    import java.util.HashSet;

public class CountDistinctElements {

    public static int countDistinct(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        return set.size();
    }

    public static void main(String[] args) {

        int[] arr = {
                1, 2, 2, 3, 4, 4, 5, 1
        };

        System.out.println(
                "Distinct Elements: "
                        + countDistinct(arr)
        );
    }
}
