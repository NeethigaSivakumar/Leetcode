package com.example.Array;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            String sorted=new String(arr);
            if(map.containsKey(sorted)){
                List<String> l=map.get(sorted);
                l.add(strs[i]);
                map.put(sorted,l);
            }
            else{
                List<String> l=new ArrayList<>();
                l.add(strs[i]);
                map.put(sorted,l);
            }
        }
        List<List<String>> res=new ArrayList<>();
        for(Map.Entry<String,List<String>> m:map.entrySet()){
            res.add(m.getValue());
        }
        return res;
    }
    public static void main(String[] args) {
        groupAnagrams(new String[]{"act","pots","tops","cat","stop","hat"});
    }
}
