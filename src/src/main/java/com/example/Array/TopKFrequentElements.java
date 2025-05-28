package com.example.Array;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentElements {


    public int[] topKFrequent2(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a, b)->{
            if(a.getKey()==b.getKey()){
                return a.getKey();
            }
            else{
                return b.getValue()-a.getValue();
            }
        });
        pq.addAll(map.entrySet());
        int[] res=new int[k];
        int ind=0;
        for(int i=0;i<k;i++){
            res[ind++]=pq.poll().getKey();
        }
        return res;
    }

    public static int[] topKFrequent3(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer>[] buckets = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (buckets[m.getValue()] == null) {
                buckets[m.getValue()] = new ArrayList<>();
            }
            buckets[m.getValue()].add(m.getKey());
        }
        List<Integer> result = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && result.size() < k; i--) {
            if (buckets[i] != null) {
                result.addAll(buckets[i]);
            }
        }
        int[] res = result.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }

    public static void main(String[] args) {
        topKFrequent3(new int[]{1,1,2,3,3,3,3},2);
    }
}
