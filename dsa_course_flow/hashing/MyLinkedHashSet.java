/* public class LinkedHashSet {
    public static void main(String[] args) {
        java.util.LinkedHashSet<String> visitedCities = new java.util.LinkedHashSet<>();
        visitedCities.add("Delhi");
        visitedCities.add("Mumbai");
        visitedCities.add("Jaipur");
        visitedCities.add("Mumbai");

        System.out.println("Unique cities in insertion order: " + visitedCities);
    }
}
 */

import java.util.LinkedHashSet;

public class MyLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("India");
        set.add("USA");
        set.add("Japan");
        set.add("Germany");

        System.out.println(
                "LinkedHashSet: " + set
        );

        System.out.println("\nIteration:");

        for (String country : set) {
            System.out.println(country);
        }
    }
}