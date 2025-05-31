package com.example.Array;

class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length + nums2.length];
        int i=0,j=0,ind=0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                res[ind++] = nums1[i++];
            } else {
                res[ind++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            res[ind++] = nums1[i++];
        }
        while (j < nums2.length) {
            res[ind++] = nums2[j++];
        }
        if(res.length%2==1){
            return (double)(res[res.length/2]);
        }
        return (double)((double)res[res.length/2-1]+(double)res[res.length/2])/2;
    }
}