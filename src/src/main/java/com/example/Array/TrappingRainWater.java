package com.example.Array;

public class TrappingRainWater {
    public static int trap(int[] height) {
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];
        int maxHeight = 0, left = height[0], right = height[height.length - 1];
        for (int i = 1; i < height.length; i++) {
            maxLeft[i] = Math.max(left, height[i - 1]);
            left = maxLeft[i];
        }
        for (int i = height.length - 2; i >= 0; i--) {
            maxRight[i] = Math.max(right, height[i + 1]);
            right = maxRight[i];
        }
        for (int i = 0; i < height.length; i++) {
            maxHeight = Math.max(maxHeight, Math.min(maxLeft[i], maxRight[i]) - height[i]);
        }
        return maxHeight;
    }

    public static int trap1(int[] height) {
        int leftMax = height[0], rightMax = height[height.length-1], left = 0, right = height.length - 1, water = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                water += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                water += rightMax - height[right];
            }
        }
        return water;
    }

    public static void main(String[] args) {
       // System.out.print(trap(new int[]{0, 2, 0, 3, 1, 0, 1, 3, 2, 1}));
        System.out.print(trap1(new int[]{0, 2, 0, 3, 1, 0, 1, 3, 2, 1}));


    }
}
