package com.example.Array;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen=Integer.MAX_VALUE,sum=0,start=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                minLen=Math.min(minLen,i-start+1);
                sum-=nums[start++];
            }
        }
        return minLen==Integer.MAX_VALUE?0:minLen;
    }
}
