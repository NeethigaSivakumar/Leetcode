package com.example.Intervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsertIntervals {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        for(int[] i:intervals){
            res.add(i);
        }
        res.add(newInterval);
        Collections.sort(res,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> merged=new ArrayList<>();
        int[] prev=res.get(0);
        for(int i=1;i<res.size();i++){
            int[] cur=res.get(i);
            if(prev[1]>=cur[0]){
                prev[1]=Math.max(prev[1],cur[1]);
            }
            else{
                merged.add(prev);
                prev=cur;
            }
        }
        merged.add(prev);
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        InsertIntervals i=new InsertIntervals();
        i.insert(new int[][]{{1,3},{6,9}},new int[]{2,5});
    }

}
