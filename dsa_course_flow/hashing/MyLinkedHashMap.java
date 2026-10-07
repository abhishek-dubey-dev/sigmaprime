/* public class LinkedHashMap {
    public static void main(String[] args) {
        java.util.Map<String, String> capitals = new java.util.LinkedHashMap<>();
        capitals.put("India", "New Delhi");
        capitals.put("Japan", "Tokyo");
        capitals.put("France", "Paris");
        capitals.put("Japan", "Tokyo");

        System.out.println("Countries in insertion order: " + capitals.keySet());
        System.out.println("Capitals: " + capitals);
    }
} */

    import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedHashMap {

    public static void main(String[] args) {

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("India", 1);
        map.put("USA", 2);
        map.put("Japan", 3);
        map.put("Germany", 4);

        System.out.println("LinkedHashMap:");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> " + entry.getValue()
            );
        }
    }
}