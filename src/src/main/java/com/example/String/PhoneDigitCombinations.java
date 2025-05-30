package com.example.String;

import java.util.ArrayList;
import java.util.List;

public class PhoneDigitCombinations {
    static String[] keypad = {
        "", "", "abc", "def", "ghi", "jkl",
        "mno", "pqrs", "tuv", "wxyz"
    };

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) return result;
        generateCombinations(digits, 0, "", result);
        return result;
    }

    private static void generateCombinations(String digits, int index, String current, List<String> result) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        String letters = keypad[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            generateCombinations(digits, index + 1, current + letters.charAt(i), result);
        }
    }

    public static void main(String[] args) {
        String input = "23";
        List<String> output = letterCombinations(input);
        System.out.println(output);
    }
}