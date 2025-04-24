package com.example.Stack;

import java.util.Arrays;
import java.util.Stack;

public class CarFleet {
    public static int carFleet(int target, int[] position, int[] speed) {
        int[][] sorted=new int[position.length][];
        for(int i=0;i<position.length;i++){
            sorted[i]=new int[]{position[i],speed[i]};
        }
        Arrays.sort(sorted,(a,b)->a[0]-b[0]);
        Stack<Integer> stack=new Stack<>();
        for(int i=sorted.length-1;i>=0;i--){
            int[] cur=sorted[i];
            int currentDestination=(target-cur[0])/cur[1];
            while(!stack.isEmpty() && currentDestination>=stack.peek()){
                stack.pop();
            }
            stack.push(currentDestination);
        }
        return stack.size();
    }

    public static void main(String[] args) {
        carFleet(10,new int[]{4,1,0,7},new int[]{2,2,1,1});
    }


}
