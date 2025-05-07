package com.example.Array;

public class RotateArray {
    public static int[] rotate1(int[] nums, int k) {
        int[] res=new int[nums.length];
        int ind=0;
        for(int i=nums.length-k;i<nums.length;i++){
            res[ind++]=nums[i];
        }
        for(int i=0;i<nums.length-k;i++){
            res[ind++]=nums[i];
        }
        return res;
    }
    public static void main(String[] args) {
        rotate1(new int[]{1,2,3,4,5,6,7},3);

    }
}
