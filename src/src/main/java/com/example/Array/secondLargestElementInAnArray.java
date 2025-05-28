package com.example.Array;

public class secondLargestElementInAnArray {

    public static int secondLargest(int[] arr){
        int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>first){
                second=first;
                first=i;
            }
            else if(i<first && i>second){
                second=i;
            }
        }
        return second==Integer.MIN_VALUE?-1:second;
    }
    public static void main(String[] args) {
        secondLargest(new int[]{10,9,8,2,3,1,11});
    }
}
