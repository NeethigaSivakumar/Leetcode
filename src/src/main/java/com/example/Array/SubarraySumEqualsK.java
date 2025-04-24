package com.example.Array;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumFreq = new HashMap<>();
        prefixSumFreq.put(0, 1);
        int count = 0, sum = 0;
        for (int num : nums) {
            sum += num;
            if (prefixSumFreq.containsKey(sum - k)) {
                count += prefixSumFreq.get(sum - k);
            }
            prefixSumFreq.put(sum, prefixSumFreq.getOrDefault(sum, 0) + 1);
        }
        return count;
    }


    public static void main(String[] args) {
        subarraySum(new int[]{1,2,3},3);
    }
}
