package com.example.Array;

import java.util.*;

public class WavePrintRowWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        int N = sc.nextInt();
        int[][] mat = new int[N][N];

        // Input matrix elements
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Wave print row-wise
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                // Left to right
                for (int j = 0; j < N; j++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                // Right to left
                for (int j = N - 1; j >= 0; j--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }

        sc.close();
    }
}
