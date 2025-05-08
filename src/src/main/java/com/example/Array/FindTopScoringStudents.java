package com.example.Array;

import java.util.HashMap;
import java.util.Map;

public class FindTopScoringStudents {
    public static String findTopScoringStudents(Map<String,int[]> map){
        String s="";
        int avg=0;
        for(Map.Entry<String,int[]> i:map.entrySet()){
            int sum=0;
            for(int j:i.getValue()){
                sum+=j;
            }
            if(sum/2>avg){
                avg=sum/2;
                s=i.getKey();
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Map<String,int[]> map=new HashMap<>();
        map.put("Alice",new int[]{90,80,70});
        map.put("Bob",new int[]{85, 95, 80});
        map.put("Charlie",new int[]{100, 60, 80});
        findTopScoringStudents(map);

    }
}
