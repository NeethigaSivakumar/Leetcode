package com.example.Array;

public class MatrixEquality {

    public static int areMatricesEqual(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (A[i][j] != B[i][j]) {
                    return 0; // Return 0 if any mismatch found
                }
            }
        }

        return 1; // Return 1 if all elements match
    }

    // Example usage
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] B = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println(areMatricesEqual(A, B));
    }
}
