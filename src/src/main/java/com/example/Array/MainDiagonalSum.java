package com.example.Array;

import java.util.Scanner;

public class MainDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read dimensions
        int R = sc.nextInt();
        int C = sc.nextInt();

        // Check for square matrix
        if (R != C) {
            System.out.println("Matrix is not square. No main diagonal.");
            return;
        }

        int[][] matrix = new int[R][C];

        // Read elements
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Calculate main diagonal sum
        int sum = 0;
        for (int i = 0; i < R; i++) {
            sum += matrix[i][i];
        }

        System.out.println(sum);
        sc.close();
    }
}
