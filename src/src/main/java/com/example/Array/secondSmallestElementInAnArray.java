package com.example.Array;

public class secondSmallestElementInAnArray {

    public static int secondSmallest(int[] arr){
        int first=Integer.MAX_VALUE,second=Integer.MAX_VALUE;
        for(int i:arr){
            if(i<first){
                first=i;
                second=first;
            }
            else if(i>first && i<second){
                second=i;
            }
        }
        return second==Integer.MAX_VALUE?-1:second;
    }

    public static void main(String[] args) {
        secondSmallest(new int[]{10,9,5,2,6});
    }
}
