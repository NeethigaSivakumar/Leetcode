package com.example.Array;

import java.util.*;

public class ColumnSum {
    public static int[] columnSums(int A, int B, int[][] C) {
        int[] result = new int[B]; // One element for each column

        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                result[j] += C[i][j];  // Add each row's value to column sum
            }
        }

        return result;
    }

    // Example usage
    public static void main(String[] args) {
        int A = 3;
        int B = 3;
        int[][] C = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[] output = columnSums(A, B, C);
        System.out.println(Arrays.toString(output));  // Output: [12, 15, 18]
    }
}
