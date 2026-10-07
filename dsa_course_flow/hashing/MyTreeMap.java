/* public class TreeMap {
    public static void main(String[] args) {
        java.util.TreeMap<Integer, String> students = new java.util.TreeMap<>();
        students.put(103, "Meera");
        students.put(101, "Aarav");
        students.put(102, "Diya");

        System.out.println("Students sorted by roll number: " + students);
        System.out.println("First roll number: " + students.firstKey());
        System.out.println("Last roll number: " + students.lastKey());
        System.out.println("First roll number after 101: " + students.higherKey(101));
    }
} */

    import java.util.TreeMap;

public class MyTreeMap {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(30, "C");
        map.put(10, "A");
        map.put(20, "B");
        map.put(40, "D");

        System.out.println("TreeMap: " + map);

        System.out.println("First Key: " + map.firstKey());

        System.out.println("Last Key: " + map.lastKey());

        System.out.println("Higher than 20: " + map.higherKey(20));

        System.out.println("Lower than 20: " + map.lowerKey(20));

        System.out.println("Ceiling 25: " + map.ceilingKey(25));

        System.out.println("Floor 25: " + map.floorKey(25));
    }
}