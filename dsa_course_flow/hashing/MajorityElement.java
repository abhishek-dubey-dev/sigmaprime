/* public class MajorityElement {
    public static java.util.OptionalInt findMajorityElement(int[] values) {
        if (values == null) {
            throw new IllegalArgumentException("values must not be null");
        }
        if (values.length == 0) {
            return java.util.OptionalInt.empty();
        }

        int candidate = 0;
        int votes = 0;
        for (int value : values) {
            if (votes == 0) {
                candidate = value;
                votes = 1;
            } else if (value == candidate) {
                votes++;
            } else {
                votes--;
            }
        }

        int occurrences = 0;
        for (int value : values) {
            if (value == candidate) {
                occurrences++;
            }
        }
        return occurrences > values.length / 2
                ? java.util.OptionalInt.of(candidate)
                : java.util.OptionalInt.empty();
    }

    public static void main(String[] args) {
        int[] values = {2, 2, 1, 1, 1, 2, 2};
        java.util.OptionalInt majority = findMajorityElement(values);
        if (majority.isPresent()) {
            System.out.println("Majority element: " + majority.getAsInt());
        } else {
            System.out.println("No majority element");
        }
    }
} */

    import java.util.HashMap;

public class MajorityElement {

    public static int majorityElement(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {

            map.put(
                    num,
                    map.getOrDefault(num, 0) + 1
            );

            if (map.get(num) > arr.length / 2) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {
                2, 2, 1, 1, 1, 2, 2
        };

        System.out.println(
                "Majority Element: "
                        + majorityElement(arr)
        );
    }
}