package com.example.Array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsequetiveSequence {

    public static int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longest = 0;
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int length = 1;
                while (numSet.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        longestConsecutive(new int[]{100, 4, 200, 1, 3, 2});
    }

}
