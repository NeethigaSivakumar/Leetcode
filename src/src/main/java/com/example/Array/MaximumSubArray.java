package com.example.Array;


//Time O(n) Space O(1)
public class MaximumSubArray {
    public static int maxSubArray(int[] nums) {
        int sum=0,max=nums[0];
        for(int i:nums){
            sum=Math.max(i,i+sum);
            max=Math.max(sum,max);
        }
        return max;
    }
}
