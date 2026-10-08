package tries;

import java.util.HashSet;
import java.util.Set;

public class UniqueSubstrings {
    public static int countUniqueSubstrings(String s) {
        Set<String> substrings = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                sb.append(s.charAt(j));
                substrings.add(sb.toString());
            }
        }

        return substrings.size();
    }

    public static void main(String[] args) {
        String s = "abca";
        System.out.println(countUniqueSubstrings(s));
    }
}
