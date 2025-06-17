package com.example.Tries;

public class DesignAddAndSearchWordDatastructure {

    class WordDictionary {
        private TrieNode node;

        public WordDictionary() {
            node = new TrieNode();
        }

        public void addWord(String word) {
            TrieNode root = node;
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (root.children[index] == null) {
                    root.children[index] = new TrieNode();
                }
                root = root.children[index];
            }
            root.flag = true;
        }

        public boolean search(String word) {
            return dfs(word, node, 0);
        }

        public boolean dfs(String word, TrieNode root, int index) {
            if (root == null) {
                return false;
            }
            if (word.length() == index ) {
                return root.flag;
            }
            char c = word.charAt(index);
            if (c == '.') {
                for (TrieNode child : root.children) {
                    if (child != null && dfs(word, child, index + 1)) {
                        return true;
                    }
                }
                return false;
            } else {
                int i = c - 'a';
                return dfs(word, root.children[i], index + 1);
            }
        }
    }
}
