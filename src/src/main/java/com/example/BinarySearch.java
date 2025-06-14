package com.example;

public class BinarySearch {
    public static int findPeakElement(int[] nums) {
    int left = 0, right = nums.length - 1;

    while (left < right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] > nums[mid + 1]) {
            right = mid;  // descending slope
        } else {
            left = mid + 1;  // ascending slope
        }
    }

    return left; // or right, since left == right
}

    public static void main(String[] args) {
        findPeakElement(new int[]{1,2,1,3,5,6,4});
    }

}
