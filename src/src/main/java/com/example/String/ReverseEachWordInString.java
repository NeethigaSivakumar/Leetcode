package com.example.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseEachWordInString {

    public String solve1(String A) {
        String trimmedString = A.trim();
        List<String> words = Arrays.asList(trimmedString.split("\\s+"));
        Collections.reverse(words);
        return String.join(" ", words);
    }

    public String solve2(String A) {
        if (A == null || A.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int n = A.length();
        int i = n - 1;

        while (i >= 0) {
            while (i >= 0 && A.charAt(i) == ' ') {
                i--;
            }
            if (i < 0) {
                break;
            }

            int j = i;
            while (j >= 0 && A.charAt(j) != ' ') {
                j--;
            }
            if (result.length() > 0) {
                result.append(' ');
            }
            result.append(A.substring(j + 1, i + 1));
            i = j;
        }
        return result.toString();
    }


}
