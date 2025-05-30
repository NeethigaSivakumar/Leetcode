package com.example;

class Sqrt
{
    public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        int start=1,end=x,ans=1;
        while(start<=end){
            int mid=start+(end-start)/2;
            long prod=(long)mid*mid;
            if(prod<x){
                ans=mid;
                start=mid+1;
            }
            else if(prod>x){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return ans; 
    }
}