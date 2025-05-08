package com.example.Array;

import java.util.HashMap;
import java.util.Map;

class SubArraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(k-nums[i])){
                count+=map.get(k-nums[i]);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        subarraySum(new int[]{1,1,1},2);
    }
}