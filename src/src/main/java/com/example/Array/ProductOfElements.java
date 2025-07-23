package com.example.Array;

public class ProductOfElements {

    public static long product(int[] A) {
        long result = 1;

        for (int num : A) {
            result *= num;
        }

        return result;
    }

    // Example usage
    public static void main(String[] args) {
        int[] A = {7, 9, 2, 51};
        System.out.println(product(A));  // Output: 6426
    }
}
