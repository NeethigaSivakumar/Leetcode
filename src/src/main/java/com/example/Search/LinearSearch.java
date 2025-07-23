package com.example.Search;

import java.util.HashMap;
import java.util.Map;

public class LinearSearch {

    public static void main(String[] args) {
        int[] ls = {100, 150, 99, 199, 99, 200, 99, 120, 100};

        // Map to store frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequency of each element
        for (int num : ls) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mode = ls[0];
        int maxCount = 0;

        // Find the element with highest frequency
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }

        System.out.println("Mode is: " + mode);
    }
}
