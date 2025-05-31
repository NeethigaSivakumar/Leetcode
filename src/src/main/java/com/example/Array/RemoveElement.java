package com.example.Array;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int i=0;
        while(i<nums.length-1){
            while(val==nums[i] && i<nums.length-1){
                nums[i]=nums[i+1];
                nums[i+1]=val;
                i++;
            }
            return i;
        }
        int sum=0;
        for(int j=0;j<val;j++){
            sum+=nums[j];
        }
        return sum;
    }

    public int removeElement1(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        removeElement(new int[]{3,2,2,3},3);
    }
}
