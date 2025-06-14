package com.example.Intervals;

import java.util.Arrays;

public class MeetingRooms {
    public boolean meetingRoom(int[][] intervals){
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int[] prev=intervals[0];
        for(int i=1;i<intervals.length;i++){
            int[] cur=intervals[i];
            if(prev[1]>=cur[0]){
                return false;
            }
            else{
                prev=cur;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        MeetingRooms m=new MeetingRooms();
        System.out.print(m.meetingRoom(new int[][]{{0,30},{5,10},{15,20}}));
        System.out.print(m.meetingRoom(new int[][]{{7,10},{2,4}}));
    }
}
