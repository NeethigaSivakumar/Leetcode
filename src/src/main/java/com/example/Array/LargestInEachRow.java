package com.example.Array;

import java.util.*;

public class LargestInEachRow {
    public static int[] largestInEachRow(int[][] A) {
        int N = A.length;
        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            int max = A[i][0];  // Start with the first element in the row
            for (int j = 1; j < A[i].length; j++) {
                if (A[i][j] > max) {
                    max = A[i][j];
                }
            }
            result[i] = max;
        }

        return result;
    }

    // Example usage
    public static void main(String[] args) {
        int[][] A = {
            {1, 5, 3},
            {10, 2, 8},
            {4, 7, 6}
        };

        int[] output = largestInEachRow(A);
        System.out.println(Arrays.toString(output));  // Output: [5, 10, 7]
    }
}
