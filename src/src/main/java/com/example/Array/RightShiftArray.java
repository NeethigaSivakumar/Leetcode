package com.example.Array;

import java.util.Scanner;

public class RightShiftArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
        int N = sc.nextInt();
        int[] A = new int[N];

        // Read array elements
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Right shift logic
        if (N > 1) {
            int last = A[N - 1];  // Save last element
            for (int i = N - 1; i > 0; i--) {
                A[i] = A[i - 1];  // Shift each element to the right
            }
            A[0] = last;  // Put last element in the first position
        }

        // Print result with space after every element (including last)
        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }

        sc.close();
    }
}
