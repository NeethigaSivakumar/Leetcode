package com.example.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Map<Integer,Integer> map=new HashMap<>();
       Stack<Integer> stack=new Stack<>();
       for(int i:nums2){
        while(!stack.isEmpty() && stack.peek()<i){
            map.put(stack.pop(),i);
        }
        stack.push(i);
       }
       for(int i=0;i<nums1.length;i++){
        if(map.containsKey(nums1[i])){
            nums1[i]=map.get(nums1[i]);
        }
        else{
            nums1[i]=-1;
        }
       }
        return nums1;
    }
}