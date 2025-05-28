package com.example.Array;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int max = 0;
        for (int val : dp) {
            max = Math.max(max, val);
        }
        return max;
    }

    public static int lengthOfLIS1(int[] nums) {
        int[] tail = new int[nums.length];
        int size = 0;

        for (int num : nums) {
            int i = Arrays.binarySearch(tail, 0, size, num);
            if (i < 0) i = -(i + 1);
            tail[i] = num;
            if (i == size) size++;
        }
        return size;
    }


    public static void main(String[] args) {
        lengthOfLIS1(new int[]{10, 9, 2, 5, 3, 7, 101, 18});
    }

}
