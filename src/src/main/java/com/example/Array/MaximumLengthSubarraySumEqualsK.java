package com.example.Array;


public class MaximumLengthSubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        int maxLength=0;
        for(int i=0;i<nums.length;i++){
            int start=i,sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k) {
                    maxLength = Math.max(maxLength, j - start + 1);
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        subarraySum(new int[]{1, -1, 5, -2, 3},3);
    }
}
