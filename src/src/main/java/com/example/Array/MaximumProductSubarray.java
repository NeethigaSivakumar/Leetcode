package com.example.Array;

public class MaximumProductSubarray {

    //Time O(n) Space O(1)
    public static int maxProduct(int[] nums) {
        int maxProd=nums[0],minProd=nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++){
            int cur=nums[i];
            if(cur<0){
                int temp=maxProd;
                maxProd=minProd;
                minProd=temp;
            }
            maxProd=Math.max(cur,cur*maxProd);
            minProd=Math.min(cur,cur*minProd);
            max=Math.max(max,maxProd);
        }
        return max;
    }

    public static void main(String[] args) {
        maxProduct(new int[]{2, 3, -2, 4});
    }
}
