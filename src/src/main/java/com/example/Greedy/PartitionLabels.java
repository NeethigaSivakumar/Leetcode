package com.example.Greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels {
    public static List<Integer> partitionLabels(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
            } else {
                map.put(s.charAt(i), Math.max(map.get(s.charAt(i)), i));
            }
        }
        int start = 0, maxIndex = 0;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (i!=0 && i == maxIndex) {
                res.add(i - start + 1);
                start = i + 1;
            }
            if (map.get(s.charAt(i)) > maxIndex) {
                maxIndex = map.get(s.charAt(i));
            }
        }
        return res;
    }
    public static void main(String[] args) {
        partitionLabels("ababcbacadefegdehijhklij");

    }
}
