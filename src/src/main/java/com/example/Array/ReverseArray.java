package com.example.Array;

import java.util.Scanner;

public class ReverseArray {

    public class PrintReverseTwoPointers {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            // Two pointer approach to reverse the array in-place
            int left = 0;
            int right = N - 1;

            while (left < right) {
                // swap arr[left] and arr[right]
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }

            // Print reversed array
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }

            sc.close();
        }
    }

}
