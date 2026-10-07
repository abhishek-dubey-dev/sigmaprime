/* public class HashSet {
    public static void main(String[] args) {
        java.util.HashSet<String> fruits = new java.util.HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("apple");

        System.out.println("Set: " + fruits);
        System.out.println("Contains banana: " + fruits.contains("banana"));
        System.out.println("Unique fruit count: " + fruits.size());
    }
} */

    import java.util.HashSet;

public class MyHashSet {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);

        // Duplicate
        set.add(10);

        System.out.println("HashSet: " + set);

        System.out.println(
                "Contains 20: " + set.contains(20)
        );

        System.out.println(
                "Size: " + set.size()
        );
    }
}
