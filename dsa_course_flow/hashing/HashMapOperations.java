/* public class HashMapOperations {
    public static void main(String[] args) {
        java.util.HashMap<String, Integer> inventory = new java.util.HashMap<>();
        inventory.put("notebook", 12);
        inventory.put("pen", 30);

        inventory.putIfAbsent("pen", 50);
        inventory.putIfAbsent("eraser", 8);
        inventory.replace("notebook", 15);
        inventory.remove("pen", 30);

        System.out.println("Notebook stock: " + inventory.getOrDefault("notebook", 0));
        System.out.println("Inventory: " + inventory);
    }
} */

    import java.util.HashMap;

public class HashMapOperations {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        // put()
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);

        System.out.println("Initial Map: " + map);

        // get()
        System.out.println("Value of B: " + map.get("B"));

        // update
        map.put("B", 50);
        System.out.println("After update: " + map);

        // containsKey()
        System.out.println("Contains A: " + map.containsKey("A"));

        // containsValue()
        System.out.println("Contains 30: " + map.containsValue(30));

        // remove()
        map.remove("C");
        System.out.println("After remove: " + map);

        // size()
        System.out.println("Size: " + map.size());

        // isEmpty()
        System.out.println("Is Empty: " + map.isEmpty());

        // clear()
        map.clear();
        System.out.println("After clear: " + map);
    }
}