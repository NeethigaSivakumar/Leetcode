package com.example.Intervals;

import java.util.Arrays;

public class MeetingRooms2 {
    public int meetingRoom2(int[][] intervals){
        int[] start=new int[intervals.length];
        int[] end=new int[intervals.length];
        for(int i=0;i<intervals.length;i++){
            start[i]=intervals[i][0];
            end[i]=intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int rooms=0,endInd=0;
        for(int i:start){
            if(i<end[endInd]){
                rooms++;
            }
            else{
                endInd++;
            }
        }
        return rooms;
    }
    public static void main(String[] args) {
        MeetingRooms2 m=new MeetingRooms2();
        System.out.println(m.meetingRoom2(new int[][]{{2,15},{5,9},{6,17},{12,20}}));
        System.out.print(m.meetingRoom2(new int[][]{{0,30},{5,10},{15,20}}));
    }
}
