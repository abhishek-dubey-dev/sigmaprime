package tries;

import java.util.ArrayList;
import java.util.List;

public class TriePrefixProblem {
    static class TrieNode {
        TrieNode[] children;
        boolean isEnd;

        TrieNode() {
            children = new TrieNode[26];
        }
    }

    static class Trie {
        TrieNode root = new TrieNode();

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

        List<String> wordsWithPrefix(String prefix) {
            TrieNode curr = root;
            for (char ch : prefix.toCharArray()) {
                int idx = ch - 'a';
                if (curr.children[idx] == null) {
                    return new ArrayList<>();
                }
                curr = curr.children[idx];
            }

            List<String> result = new ArrayList<>();
            collect(curr, prefix, result);
            return result;
        }

        void collect(TrieNode node, String prefix, List<String> result) {
            if (node.isEnd) {
                result.add(prefix);
            }
            for (int i = 0; i < 26; i++) {
                if (node.children[i] != null) {
                    char ch = (char) ('a' + i);
                    collect(node.children[i], prefix + ch, result);
                }
            }
        }
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("apricot");
        trie.insert("banana");

        System.out.println(trie.wordsWithPrefix("app"));
        System.out.println(trie.wordsWithPrefix("ban"));
    }
}
