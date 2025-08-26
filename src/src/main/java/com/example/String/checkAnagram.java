package com.example.String;

public class checkAnagram {

    public static boolean isAnagram(String A, String B) {
        if (A.length() != B.length()) {
            return false; // If lengths differ, they cannot be anagrams
        }

        int[] charCount = new int[26]; // Assuming only lowercase letters a-z

        for (char c : A.toCharArray()) {
            charCount[c - 'a']++; // Increment count for character in A
        }

        for (char c : B.toCharArray()) {
            charCount[c - 'a']--; // Decrement count for character in B
            if (charCount[c - 'a'] < 0) {
                return false; // If count goes negative, not an anagram
            }
        }

        return true; // All counts should be zero if they are anagrams
    }

    public static void main(String[] args) {
        String A = "listen";
        String B = "silent";
        System.out.println(isAnagram(A, B)); // Output: true
    }

}
