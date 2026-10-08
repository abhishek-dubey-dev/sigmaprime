package tries;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordBreakProblem {
    public static boolean wordBreak(String s, String[] words) {
        Set<String> dict = new HashSet<>(Arrays.asList(words));
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && dict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }

    public static void main(String[] args) {
        String s = "leetcode";
        String[] words = {"leet", "code"};
        System.out.println(wordBreak(s, words));
    }
}
