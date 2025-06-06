package com.example.Array;

public class ProductOfArrayExceptSelf {

    //Time O(n) Space O(n)
    public static int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        int prod=1;
        for(int i=0;i<nums.length;i++){
            res[i]=prod;
            prod*=nums[i];
        }
        prod=1;
        for(int i=nums.length-1;i>=0;i--){
            res[i]*=prod;
            prod*=nums[i];
        }
        return res;
    }
}
