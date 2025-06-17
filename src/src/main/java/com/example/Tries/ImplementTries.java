package com.example.Tries;

public class ImplementTries {
    class TrieNode{
        TrieNode[] children;
        boolean flag;
        public TrieNode(){
            children=new TrieNode[26];
            flag=false;
        }
    }

    class Trie {
        private TrieNode node;

        public Trie() {
            node=new TrieNode();
        }

        public void insert(String word) {
            TrieNode root=node;
            for(char c:word.toCharArray()){
                int index=c-'a';
                if(root.children[index]==null){
                    root.children[index]=new TrieNode();
                }
                root=root.children[index];
            }
            root.flag=true;
        }

        public boolean search(String word) {
            TrieNode root=node;
            for(char c:word.toCharArray()){
                int index=c-'a';
                if(root.children[index]==null){
                    return false;
                }
                root=root.children[index];
            }
            return root.flag;
        }

        public boolean startsWith(String prefix) {
            TrieNode root=node;
            for(char c:prefix.toCharArray()){
                int index=c-'a';
                if(root.children[index]==null){
                    return false;
                }
                root=root.children[index];
            }
            return true;
        }
    }
}
