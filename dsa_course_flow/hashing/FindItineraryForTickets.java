/* public class FindItineraryForTickets {
    public static java.util.List<String> findItinerary(java.util.Map<String, String> tickets) {
        if (tickets == null) {
            throw new IllegalArgumentException("tickets must not be null");
        }
        if (tickets.isEmpty()) {
            return java.util.Collections.emptyList();
        }

        java.util.Set<String> destinations = new java.util.HashSet<>(tickets.values());
        String start = null;
        for (String source : tickets.keySet()) {
            if (!destinations.contains(source)) {
                if (start != null) {
                    throw new IllegalArgumentException("Tickets contain more than one starting city");
                }
                start = source;
            }
        }
        if (start == null) {
            throw new IllegalArgumentException("Tickets do not have a starting city");
        }

        java.util.List<String> itinerary = new java.util.ArrayList<>();
        java.util.Set<String> visited = new java.util.HashSet<>();
        String city = start;
        itinerary.add(city);
        while (tickets.containsKey(city)) {
            if (!visited.add(city)) {
                throw new IllegalArgumentException("Tickets contain a cycle");
            }
            city = tickets.get(city);
            itinerary.add(city);
        }
        if (visited.size() != tickets.size()) {
            throw new IllegalArgumentException("Tickets do not form one connected itinerary");
        }
        return itinerary;
    }

    public static void main(String[] args) {
        java.util.Map<String, String> tickets = new java.util.HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        System.out.println("Itinerary: " + String.join(" -> ", findItinerary(tickets)));
    }
} */

    import java.util.*;

public class FindItineraryForTickets {

    public static void main(String[] args) {

        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        // Find destination cities
        HashSet<String> destinations = new HashSet<>();

        for (String destination : tickets.values()) {
            destinations.add(destination);
        }

        String start = null;

        // Find starting city
        for (String source : tickets.keySet()) {

            if (!destinations.contains(source)) {
                start = source;
                break;
            }
        }

        System.out.println("Itinerary:");

        while (start != null) {

            System.out.print(start);

            start = tickets.get(start);

            if (start != null) {
                System.out.print(" -> ");
            }
        }
    }
}
