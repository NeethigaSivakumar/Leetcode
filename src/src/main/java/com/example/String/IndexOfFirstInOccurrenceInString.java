package com.example.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class IndexOfFirstInOccurrenceInString {

    //Time O(n*m) Space O(m)
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        } else if (needle.length() == haystack.length() && needle.equals(haystack)) {
            return 0;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            String cur = haystack.substring(i, i + needle.length());
            if (cur.equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    //Time O(n*m) Space O(n*m)
    public int strStr1(String haystack, String needle) {
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            map.put(haystack.substring(i, i + needle.length()),i);
        }
        return map.containsKey(needle)?map.get(needle):-1;
    }

}