package com.example;

public class MergeSort {
        public static void sort(int[] arr) {
            int[] temp = new int[arr.length];  // temp array used for merging
            mergeSort(arr, temp, 0, arr.length - 1);
        }

        private static void mergeSort(int[] arr, int[] temp, int left, int right) {
            if (left >= right) return;  // base case: single element

            int mid = left + (right - left) / 2;  // find middle index
            mergeSort(arr, temp, left, mid);      // sort left half
            mergeSort(arr, temp, mid + 1, right); // sort right half
            merge(arr, temp, left, mid, right);   // merge both halves
        }

        private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
            // copy relevant part of arr into temp
            for (int i = left; i <= right; i++) {
                temp[i] = arr[i];
            }

            int i = left;      // pointer for left half
            int j = mid + 1;   // pointer for right half
            int k = left;      // pointer for merged array

            while (i <= mid && j <= right) {  // merge smallest first
                if (temp[i] <= temp[j]) {
                    arr[k++] = temp[i++];
                } else {
                    arr[k++] = temp[j++];
                }
            }

            while (i <= mid) {  // copy leftover from left side
                arr[k++] = temp[i++];
            }
            // no need to copy right side leftovers (already in place)
        }

    public static void main(String[] args) {
        sort(new int[]{20,10,5,1,6});
    }

}
