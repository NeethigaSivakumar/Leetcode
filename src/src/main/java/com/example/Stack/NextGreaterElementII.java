package com.example.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementII {
    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        Map<Integer,Integer> map=new HashMap<>();
        boolean flag=false;
        int last=nums[nums.length-1];
        for(int i:nums){
            if(i>nums[nums.length-1] && flag==false){
                last=i;
                flag=true;
            }
            while(!stack.isEmpty() && stack.peek()<=i){
                map.put(stack.pop(),i);
            }
            stack.push(i);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=map.getOrDefault(nums[i],-1);
        }
        nums[nums.length-1]=last;
        return nums;
    }

    public static void main(String[] args) {
        nextGreaterElements(new int[]{1,2,1});
    }
}
