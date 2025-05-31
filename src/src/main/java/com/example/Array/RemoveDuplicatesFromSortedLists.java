package com.example.Array;

class RemoveDuplicatesFromSortedLists {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;  // Points to the last unique element
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;               // Move to the next position
                nums[i] = nums[j]; // Place the new unique element
            }
        }
        return i + 1; // New length (i is index)
    }
}