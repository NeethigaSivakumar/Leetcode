package com.example.Array;

public class MatrixTranspose {

    public static int[][] transpose(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;

        int[][] result = new int[cols][rows]; // Note: flipped dimensions

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = A[i][j]; // Swap row and column
            }
        }

        return result;
    }

    // Example usage
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] transposed = transpose(A);

        // Print the transposed matrix
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[i].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
