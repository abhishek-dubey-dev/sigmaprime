/* public class IterationOnHashMap {
    public static void main(String[] args) {
        java.util.Map<String, Integer> scores = new java.util.LinkedHashMap<>();
        scores.put("Asha", 91);
        scores.put("Rohan", 84);
        scores.put("Meera", 97);

        System.out.println("Iterating over entries:");
        for (java.util.Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("Iterating over keys:");
        for (String name : scores.keySet()) {
            System.out.println(name);
        }

        System.out.println("Iterating over values:");
        for (int score : scores.values()) {
            System.out.println(score);
        }
    }
} */

    import java.util.HashMap;
import java.util.Map;

public class IterationOnHashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 100);
        map.put("USA", 200);
        map.put("Japan", 300);

        // 1. Using keySet()
        System.out.println("Using keySet:");

        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // 2. Using entrySet()
        System.out.println("\nUsing entrySet:");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(
                    entry.getKey() + " -> " + entry.getValue()
            );
        }

        // 3. Using forEach()
        System.out.println("\nUsing forEach:");

        map.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });
    }
}