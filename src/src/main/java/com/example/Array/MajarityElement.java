package com.example.Array;

import java.util.HashMap;
import java.util.Map;

public class MajarityElement {

    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=0,maxValue=0;
        for(Map.Entry<Integer,Integer> i:map.entrySet()){
            if(i.getValue()>max){
                maxValue=i.getKey();
                max=i.getValue();
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        majorityElement(new int[]{4,3,3});
    }
}
