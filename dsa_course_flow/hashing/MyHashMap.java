/* public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<String, Integer> studentMarks = new java.util.HashMap<>();
        studentMarks.put("Aarav", 92);
        studentMarks.put("Diya", 85);
        studentMarks.put("Kabir", 78);
        studentMarks.put("Diya", 89);

        System.out.println("Student marks: " + studentMarks);
        System.out.println("Diya's mark: " + studentMarks.get("Diya"));
        System.out.println("Contains Kabir: " + studentMarks.containsKey("Kabir"));
        System.out.println("Number of students: " + studentMarks.size());
    }
} */
import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 140);
        map.put("USA", 34);
        map.put("Japan", 12);

        System.out.println(map);

        System.out.println("India: " + map.get("India"));
        System.out.println("USA: " + map.get("USA"));

        System.out.println("Contains India: " + map.containsKey("India"));
        System.out.println("Contains value 12: " + map.containsValue(12));
    }
}