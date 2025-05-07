package com.example.Array;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String i : strs) {
            char[] ch=new char[26];
            for(char s:i.toCharArray()){
                ch[s-'a']++;
            }
            String sorted = new String(ch);
            map.computeIfAbsent(sorted,k-> new ArrayList<>()).add(i);
        }
        List<List<String>> res = map.values().stream().toList();
        return res;
    }
    public static void main(String[] args) {
        groupAnagrams(new String[]{"act","pots","tops","cat","stop","hat"});
    }
}
