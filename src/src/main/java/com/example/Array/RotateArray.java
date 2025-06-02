package com.example.Array;

public class RotateArray {
    public static int[] rotate(int[] nums, int k) {
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

    //Time O(n) Space O(1)
    public static void rotate1(int[] nums, int k) {
        if(nums==null || nums.length==0 || k==0){
            return;
        }
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    public static void reverse(int[] nums, int start,int end) {
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        rotate1(new int[]{-1,-100,3,99},2);

    }
}
