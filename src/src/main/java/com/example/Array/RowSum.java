package com.example.Array;

import java.util.*;

public class RowSum {
    public static int[] computeRowSums(int[][] A) {
        int rows = A.length;
        int[] result = new int[rows];

        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < A[i].length; j++) {
                rowSum += A[i][j];
            }
            result[i] = rowSum;
        }

        return result;
    }

    // Example usage
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[] rowSums = computeRowSums(A);
        System.out.println(Arrays.toString(rowSums));  // Output: [6, 15, 24]
    }
}
