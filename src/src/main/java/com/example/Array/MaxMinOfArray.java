package com.example.Array;

import java.util.Scanner;

public class MaxMinOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read entire line with N and elements
        String line = sc.nextLine();
        String[] parts = line.trim().split("\\s+");

        int N = Integer.parseInt(parts[0]);
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(parts[i + 1]);
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Print max and min with one space in between, no trailing space after min
        System.out.println(max + " " + min);

        sc.close();
    }
}
