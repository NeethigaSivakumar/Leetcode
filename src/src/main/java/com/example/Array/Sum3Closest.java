package com.example.Array;

import java.util.Arrays;

class Sum3Closest {
    public int threeSumClosest(int[] nums, int target) {
        int closest=nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1,k=nums.length-1;
            while(j<k){
                int total=nums[i]+nums[j]+nums[k];
                if(Math.abs(closest-target)>Math.abs(total-target)){
                    closest=total;
                }
                if(total>target){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return closest;
    }
}