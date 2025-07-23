package com.example.Array;

public class MatrixSubtraction {

    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        // Perform element-wise subtraction
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }

        return result;
    }

    // Example usage
    public static void main(String[] args) {
        int[][] A = {
            {5, 8},
            {10, 12}
        };

        int[][] B = {
            {2, 3},
            {4, 6}
        };

        int[][] result = subtractMatrices(A, B);

        // Print result matrix
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
