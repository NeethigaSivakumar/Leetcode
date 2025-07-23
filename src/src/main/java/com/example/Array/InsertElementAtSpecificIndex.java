package com.example.Array;

import java.util.Scanner;

public class InsertElementAtSpecificIndex {


    public class InsertAtPosition {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input N
            int N = sc.nextInt();

            // Input array of N elements
            int[] original = new int[N];
            for (int i = 0; i < N; i++) {
                original[i] = sc.nextInt();
            }

            // Input position (1-based index)
            int X = sc.nextInt();

            // Input value to insert
            int Y = sc.nextInt();

            // Create a new array of size N+1
            int[] updated = new int[N + 1];

            // Fill updated array with insertion logic
            for (int i = 0; i < X - 1; i++) {
                updated[i] = original[i];
            }

            updated[X - 1] = Y; // Insert Y at position X (convert to 0-based)

            for (int i = X; i <= N; i++) {
                updated[i] = original[i - 1]; // Shift rest to the right
            }

            // Print the updated array
            for (int i = 0; i < updated.length; i++) {
                System.out.print(updated[i] + " ");
            }

            sc.close();
        }
    }

}
