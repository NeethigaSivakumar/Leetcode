package com.example.Array;

public class MaximumSumSubarrayOfSizeK {
    public int maximumSumOfSizeK(int[] nums,int k){
        if(k>nums.length){
            return -1;
        }
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int start=0,maxSum=Integer.MIN_VALUE;
        for(int i=k;i<nums.length;i++){
            maxSum=Math.max(maxSum,sum);
            sum-=nums[start++];
        }
        maxSum=Math.max(maxSum,sum);
        return maxSum;
    }
}
