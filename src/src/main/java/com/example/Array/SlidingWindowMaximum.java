package com.example.Array;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return result;
    }

    public static int[] maxSlidingWindow2(int[] nums, int k) {
        if(nums.length==0 || nums==null || k<=0){
            return new int[]{0};
        }
        Deque<Integer> deque=new ArrayDeque<>();
        int[] res=new int[nums.length-k+1];
        for(int i=0;i<nums.length;i++){
            while(!deque.isEmpty() && nums[i]>nums[deque.peekLast()]){
                deque.pollLast();
            }
            while(!deque.isEmpty() && deque.peekFirst()<i-k+1){
                deque.pollFirst();
            }
            deque.offerLast(i);
            if(i>=k-1){
                res[i-k+1]=nums[deque.peekFirst()];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3);

    }
}
