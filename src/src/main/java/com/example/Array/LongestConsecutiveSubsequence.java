package com.example.Array;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class LongestConsecutiveSubsequence {

    public static int longestConsecutive(int[] nums) {
        int maxLength=0,prev=0,count=0;
        TreeSet<Integer> treeSet=new TreeSet<>();
        for(int i:nums){
            treeSet.add(i);
        }
        for(Integer i:treeSet){
            if(prev+1==i){
                count++;
            }
            prev=i;
            maxLength=Math.max(count,maxLength);
        }
        return maxLength;
    }
}
