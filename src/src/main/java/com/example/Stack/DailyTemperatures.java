package com.example.Stack;

import java.util.Stack;

//array empty
//negative elemnets
//array length
//values range in array
//duplicate values
public class DailyTemperatures {

    //Time O(n) space O(n)
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && stack.peek()[0] < temperatures[i]) {
                int[] popped = stack.pop();
                res[popped[1]] = i - popped[1];
            }
            stack.push(new int[]{temperatures[i], i});
        }
        return res;
    }

    public static void main(String[] args) {
        dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
    }
}