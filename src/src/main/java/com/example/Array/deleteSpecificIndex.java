package com.example.Array;

import java.util.Scanner;

public class deleteSpecificIndex {

    public class DeleteElementAtPosition {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input N
            int N = sc.nextInt();

            // Input array
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            // Input X (1-based position to delete)
            int X = sc.nextInt();

            // Print array after deleting element at position X
            for (int i = 0; i < N; i++) {
                if (i != X - 1) {  // Skip the Xth element (convert to 0-based index)
                    System.out.print(A[i] + " ");
                }
            }

            sc.close();
        }
    }

}
