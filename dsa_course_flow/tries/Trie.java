package tries;

import java.util.Arrays;

public class Trie {
    static class TrieNode {
        TrieNode[] children;
        boolean isEnd;

        TrieNode() {
            this.children = new TrieNode[26];
            this.isEnd = false;
        }
    }

    static class TrieSet {
        private final TrieNode root;

        TrieSet() {
            this.root = new TrieNode();
        }

        public void insert(String word) {
            TrieNode current = root;
            for (char ch : word.toCharArray()) {
                int index = ch - 'a';
                if (current.children[index] == null) {
                    current.children[index] = new TrieNode();
                }
                current = current.children[index];
            }
            current.isEnd = true;
        }

        public boolean search(String word) {
            TrieNode current = root;
            for (char ch : word.toCharArray()) {
                int index = ch - 'a';
                if (current.children[index] == null) {
                    return false;
                }
                current = current.children[index];
            }
            return current.isEnd;
        }

        public boolean startsWith(String prefix) {
            TrieNode current = root;
            for (char ch : prefix.toCharArray()) {
                int index = ch - 'a';
                if (current.children[index] == null) {
                    return false;
                }
                current = current.children[index];
            }
            return true;
        }

        public int countWords() {
            return countWords(root);
        }

        private int countWords(TrieNode node) {
            int total = 0;
            if (node.isEnd) {
                total++;
            }
            for (TrieNode child : node.children) {
                if (child != null) {
                    total += countWords(child);
                }
            }
            return total;
        }
    }

    public static void main(String[] args) {
        TrieSet trie = new TrieSet();
        String[] words = {"apple", "app", "apricot", "banana", "bat"};

        Arrays.stream(words).forEach(trie::insert);

        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("apr"));
        System.out.println(trie.countWords());
    }
}
