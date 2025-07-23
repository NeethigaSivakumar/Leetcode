package com.example.Array;

public class ConsecutiveDuplicate {
    public static boolean hasConsecutiveDuplicates(int[] A) {
        for (int i = 1; i < A.length; i++) {
            if (A[i] == A[i - 1]) {
                return true;
            }
        }
        return false;
    }

    // Optional main method to test
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {7, 7, 7};
        int[] arr4 = {5};

        System.out.println(hasConsecutiveDuplicates(arr1)); // true
        System.out.println(hasConsecutiveDuplicates(arr2)); // false
        System.out.println(hasConsecutiveDuplicates(arr3)); // true
        System.out.println(hasConsecutiveDuplicates(arr4)); // false
    }
}
