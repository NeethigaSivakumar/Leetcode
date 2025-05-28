package com.example.Queue;

import java.util.PriorityQueue;

class FindKthLargest {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();        
    }

    public static void main(String[] args) {
        findKthLargest(new int[]{3,2,3,1,2,4,5,5,6},4);
    }
}