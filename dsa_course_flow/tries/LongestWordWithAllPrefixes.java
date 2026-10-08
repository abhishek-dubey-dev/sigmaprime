package tries;

import java.util.Arrays;

public class LongestWordWithAllPrefixes {
    static class TrieNode {
        TrieNode[] children;
        boolean isEnd;

        TrieNode() {
            children = new TrieNode[26];
        }
    }

    static class Trie {
        TrieNode root;

        Trie() {
            root = new TrieNode();
        }

        void insert(String word) {
            TrieNode curr = root;
            for (char ch : word.toCharArray()) {
                int idx = ch - 'a';
                if (curr.children[idx] == null) {
                    curr.children[idx] = new TrieNode();
                }
                curr = curr.children[idx];
            }
            curr.isEnd = true;
        }

        String longestWordWithAllPrefixes(String[] words) {
            Arrays.sort(words, (a, b) -> {
                if (a.length() != b.length()) return Integer.compare(a.length(), b.length());
                return a.compareTo(b);
            });

            String best = "";
            for (String word : words) {
                if (isValid(word)) {
                    best = word;
                }
            }
            return best;
        }

        boolean isValid(String word) {
            TrieNode curr = root;
            for (char ch : word.toCharArray()) {
                int idx = ch - 'a';
                if (curr.children[idx] == null) {
                    return false;
                }
                curr = curr.children[idx];
                if (!curr.isEnd) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        String[] words = {"a", "b", "ba", "bca", "bda", "bdca"};

        for (String word : words) {
            trie.insert(word);
        }

        System.out.println(trie.longestWordWithAllPrefixes(words));
    }
}
