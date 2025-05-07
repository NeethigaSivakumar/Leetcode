package com.example.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a, b)->a[0]-b[0]);
        List<int[]> merged=new ArrayList<>();
        int[] prev=intervals[0];
        for(int i=1;i<intervals.length;i++){
            int[] cur=intervals[i];
            if(cur[0]<=prev[1]){
                prev[1]= Math.max(prev[1],cur[1]);
            }
            else{
                merged.add(prev);
                prev=cur;
            }
        }
        merged.add(prev);
        return merged.toArray(new int[merged.size()][]);
    }
    public static void main(String[] args) {

    }
}
