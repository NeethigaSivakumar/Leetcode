package com.example.String;

import java.util.*;

public class PhoneNumberLetterCombinations {

    private static List<String> res;

    //Time O(3pown * 4^m) Space O(k*lpowk)
    public static List<String> letterCombinations(String digits) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "");
        map.put(1, "");
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        res = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return res;
        }
        backTrack(map, new StringBuilder(), digits, 0);
        return res;
    }

    public static void backTrack(Map<Integer, String> map, StringBuilder cur, String digits, int index) {
        if (cur.length() == digits.length()) {
            res.add(cur.toString());
            return;
        }
        int ch = digits.charAt(index) - '0';
        String letters = map.get(ch);
        for (char c : letters.toCharArray()) {
            cur.append(c);
            backTrack(map, cur, digits, index + 1);
            cur.deleteCharAt(cur.length() - 1);
        }
    }


    // Test
    public static void main(String[] args) {
        String phoneNumber = "23";
        List<String> combinations = letterCombinations(phoneNumber);
        System.out.println("Letter combinations for " + phoneNumber + ": " + combinations);
    }
}
