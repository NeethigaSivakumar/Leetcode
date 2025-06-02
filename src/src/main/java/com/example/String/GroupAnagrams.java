package com.example.String;

import java.util.*;

public class GroupAnagrams {

    //Time O(m*n) Space O(m*n)
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String i:strs){
            char[] ch=new char[26];
            for(char c:i.toCharArray()){
                ch[c-'a']++;
            }
            String s= Arrays.toString(ch);
            map.computeIfAbsent(s,k->new ArrayList<>()).add(i);
        }
        List<List<String>> res=map.values().stream().toList();
        return res;
    }
}
