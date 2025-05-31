package com.example.Array;

public class FirstLastPositionOfElementInArray {
    public int[] searchRange(int[] nums, int target) {

        int result[] = {-1, -1};
        int start = getAns(nums, target, true);
        int end = getAns(nums, target, false);
        result[0] = start;
        result[1] = end;
        return result;

    }

    public int getAns(int[] nums, int target, boolean firstStartIndex) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;
        int ans = -1;
        while (start <= end) {
            mid = start + ((end - start) / 2);
            if (nums[mid] == target) {
                ans = mid;
                if (firstStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

}
