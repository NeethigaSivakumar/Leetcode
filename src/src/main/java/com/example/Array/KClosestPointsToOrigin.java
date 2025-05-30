package com.example.Array;

import java.util.PriorityQueue;

class KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a, b)->Integer.compare(distance(b),distance(a)));
        for(int[] i:points){
            pq.offer(i);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[][] res=new int[k][];
        int ind=0;
        for(int i=0;i<k;i++){
            res[ind++]=pq.poll();
        }
        return res;
    }

    public int distance(int[] i){
        int a=i[0]*i[0]+i[1]*i[1];
        return a;
    }
}