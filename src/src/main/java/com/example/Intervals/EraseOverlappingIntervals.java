package com.example.Intervals;

import java.util.Arrays;

public class EraseOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count=0;
        Arrays.sort(intervals,(a, b)->a[1]-b[1]);
        int prev = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int[] cur = intervals[i];
            if (prev >cur[0]) {
                count++;
            } else {
                prev = cur[1];
            }
        }
        return count;
    }
}
