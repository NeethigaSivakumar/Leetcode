package com.example.Stack;

import java.util.Stack;

//array contain negative elements
//if array is empty
//input range of values in heights
//height length
//duplicate bars allowed?
public class LargestRectangleInHistogram {

    //BruteForce
    //Time O(N) Space O(N)
    public static int largestRectangleArea(int[] heights) {
        int[] pse=new int[heights.length];
        int[] nse=new int[heights.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            pse[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        stack.clear();
        for(int i=heights.length-1;i>=0;i--){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            nse[i]=stack.isEmpty()?heights.length:stack.peek();
            stack.push(i);
        }
        int maxArea=0;
        for(int i=0;i<heights.length;i++){
            maxArea=Math.max(maxArea,heights[i]*(nse[i]-pse[i]-1));
        }
        return maxArea;
    }

    public static void main(String[] args) {
        largestRectangleArea(new int[]{2,1,5,6,2,3});
    }
}
