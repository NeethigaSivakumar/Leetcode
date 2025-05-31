package com.example.Array;

class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int start=0,end=height.length-1,maxWater=0,min=0;
        while(start<end){
            min=Math.min(height[start],height[end]);
            maxWater=Math.max(maxWater,min*(end-start));
            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return maxWater;
    }
}