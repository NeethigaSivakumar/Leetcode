package com.example.Array;

import java.util.*;

public class WavePrintColumnWise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read matrix size
        int N = sc.nextInt();
        int[][] mat = new int[N][N];

        // Read matrix elements
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Print in wave form (column-wise)
        for (int col = 0; col < N; col++) {
            if (col % 2 == 0) {
                // Even column - top to bottom
                for (int row = 0; row < N; row++) {
                    System.out.print(mat[row][col] + " ");
                }
            } else {
                // Odd column - bottom to top
                for (int row = N - 1; row >= 0; row--) {
                    System.out.print(mat[row][col] + " ");
                }
            }
        }

        sc.close();
    }
}
