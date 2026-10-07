/* public class ValidAnagram {
    public static boolean areAnagrams(String first, String second) {
        if (first == null || second == null) {
            return first == second;
        }

        int[] firstCodePoints = first.codePoints().toArray();
        int[] secondCodePoints = second.codePoints().toArray();
        if (firstCodePoints.length != secondCodePoints.length) {
            return false;
        }

        java.util.Map<Integer, Integer> frequencies = new java.util.HashMap<>();
        for (int codePoint : firstCodePoints) {
            frequencies.put(codePoint, frequencies.getOrDefault(codePoint, 0) + 1);
        }
        for (int codePoint : secondCodePoints) {
            Integer count = frequencies.get(codePoint);
            if (count == null) {
                return false;
            }
            if (count == 1) {
                frequencies.remove(codePoint);
            } else {
                frequencies.put(codePoint, count - 1);
            }
        }
        return frequencies.isEmpty();
    }

    public static void main(String[] args) {
        String first = "listen";
        String second = "silent";
        System.out.println(first + " and " + second + " are anagrams: "
                + areAnagrams(first, second));
    }
} */

    import java.util.HashMap;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Frequency of first string
        for (char ch : s.toCharArray()) {

            map.put(
                    ch,
                    map.getOrDefault(ch, 0) + 1
            );
        }

        // Remove frequency using second string
        for (char ch : t.toCharArray()) {

            if (!map.containsKey(ch)) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        return map.isEmpty();
    }

    public static void main(String[] args) {

        String s = "race";
        String t = "care";

        System.out.println(
                "Is Anagram: " + isAnagram(s, t)
        );
    }
}
