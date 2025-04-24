package com.example.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> res=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();
        for(String i:words){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Map.Entry<String,Integer>> sortedMap=map.entrySet().stream().sorted((a,b)->{
            if(a.getValue()!=b.getValue()){
                return a.getKey().compareTo(b.getKey());
            }
            else{
                return b.getValue()-a.getValue();
            }
        }).collect(Collectors.toList());
        for(Map.Entry<String,Integer> i:sortedMap){
            res.add(i.getKey());
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
