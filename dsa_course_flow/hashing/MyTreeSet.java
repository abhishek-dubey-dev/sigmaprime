/* public class TreeSet {
    public static void main(String[] args) {
        java.util.TreeSet<Integer> scores = new java.util.TreeSet<>();
        scores.add(72);
        scores.add(95);
        scores.add(81);
        scores.add(65);

        System.out.println("Scores in sorted order: " + scores);
        System.out.println("Lowest score: " + scores.first());
        System.out.println("Highest score: " + scores.last());
        System.out.println("Next score after 81: " + scores.higher(81));
    }
} */

    import java.util.TreeSet;

public class MyTreeSet {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(30);
        set.add(10);
        set.add(20);
        set.add(40);

        System.out.println("TreeSet: " + set);

        System.out.println(
                "First: " + set.first()
        );

        System.out.println(
                "Last: " + set.last()
        );

        System.out.println(
                "Higher than 20: " + set.higher(20)
        );

        System.out.println(
                "Lower than 20: " + set.lower(20)
        );
    }
}
