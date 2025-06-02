package com.example.Array;

import java.util.HashSet;
import java.util.Set;

public class IntegersectionOfTwoArrays {

    //Time O(n) SpaceO(n)
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> res=new HashSet<>();
        Set<Integer> nums1Set=new HashSet<>();
        for(int i:nums1){
            nums1Set.add(i);
        }
        for(int i:nums2){
            if(nums1Set.contains(i)){
                res.add(i);
            }
        }
        int[] ans=new int[res.size()];
        int ind=0;
        for(Integer i:ans) {
            ans[ind++]=i;
        }
        return ans;
    }
}
