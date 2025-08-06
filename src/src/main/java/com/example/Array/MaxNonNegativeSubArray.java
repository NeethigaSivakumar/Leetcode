package com.example.Array;

public class MaxNonNegativeSubArray {

    public int maxNonNegativeSubArray(int[] arr){
        int sum=0,max=0;
        for(int i:arr){
            if(i<0){
                sum=0;
            }
            else {
                sum += i;
                int s = Math.max(i, sum);
                max = Math.max(max, s);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MaxNonNegativeSubArray m=new MaxNonNegativeSubArray();
        m.maxNonNegativeSubArray(new int[]{1, 2, 5, -7, 2, 3});
    }

}
