package com.example.Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//array length
//array contains positive negative 0
//if x is 0 when to do
//only single element in array
public class ProductEqualToK {
    public int[] findPair(int[] nums,int x){
        Set<Integer> set = new HashSet<>();

        // Handle the special case when x == 0
        if (x == 0) {
            int zeroCount = 0;
            for (int num : nums) {
                if (num == 0) {
                    zeroCount++;
                    if (zeroCount == 2) {
                        return new int[]{0, 0};
                    }
                }
            }
            return new int[]{-1, -1}; // No pair of zeros found
        }

        for (int num : nums) {
            // Avoid division by zero and check if current num divides x perfectly
            if (num != 0 && x % num == 0 && set.contains(x / num)) {
                return new int[]{num, x / num};
            }
            set.add(num);
        }

        return new int[]{-1, -1}; // No such pair found
    }
    public static void main(String[] args) {

    }

}
