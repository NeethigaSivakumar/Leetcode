package com.example.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[] l=map.values().stream().sorted((a,b)->b-a).limit(k).mapToInt(Integer::intValue).toArray();
        return l;
    }

    public static void main(String[] args) {
        topKFrequent(new int[]{1,2,2,3,3,3},2);
    }
}
