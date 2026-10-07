/* public class HashSetOperations {
    public static void main(String[] args) {
        java.util.HashSet<Integer> numbers = new java.util.HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        System.out.println("After adding values: " + numbers);

        numbers.remove(10);
        System.out.println("After removing 10: " + numbers);
        System.out.println("Contains 30: " + numbers.contains(30));
        System.out.println("Is empty: " + numbers.isEmpty());

        numbers.clear();
        System.out.println("After clear: " + numbers);
    }
} */

    import java.util.HashSet;

public class HashSetOperations {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // ADD
        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println("Set: " + set);

        // CONTAINS
        System.out.println(
                "Contains 20: " + set.contains(20)
        );

        // REMOVE
        set.remove(20);

        System.out.println(
                "After remove: " + set
        );

        // SIZE
        System.out.println(
                "Size: " + set.size()
        );

        // EMPTY
        System.out.println(
                "Is Empty: " + set.isEmpty()
        );

        // CLEAR
        set.clear();

        System.out.println(
                "After clear: " + set
        );
    }
}
