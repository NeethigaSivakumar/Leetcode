package com.example.String;

import java.util.Stack;

//if string is empty or null
//will string have only ()
class LongestValidParentheses {

    //Time O(n) Space O(1)
    public int longestValidParentheses(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int left = 0, right = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else
                right++;
            if (right > left) {
                left = 0;
                right = 0;
            } else if (left == right) {
                max = Math.max(max, left * 2);
            }
        }
        left = 0;
        right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;
            } else
                right++;
            if (left > right) {
                left = 0;
                right = 0;
            } else if (left == right) {
                max = Math.max(max, left * 2);
            }
        }
        return max;
    }

    //Time O(n) Space O(n)
    //stack.push(-1) is to handle edge case "()"
    public int longestValidParentheses1(String s) {
        int maxLen=0;
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    maxLen=Math.max(maxLen,i-stack.peek());
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {

        LongestValidParentheses l=new LongestValidParentheses();
        l.longestValidParentheses1("(()()");
    }
}