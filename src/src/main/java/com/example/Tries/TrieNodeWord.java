package com.example.Tries;

class TrieNodeWord {
    TrieNodeWord[] children;
    String word;

    public TrieNodeWord() {
        children = new TrieNodeWord[26];
        word = null;
    }
}