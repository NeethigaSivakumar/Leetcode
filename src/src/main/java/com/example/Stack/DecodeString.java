package com.example.Stack;

import java.util.Stack;

//max string length
//will any unexpected caracters otherthan, alphabets, numbers,[
//if string empty
//any negative numbers in string

public class DecodeString {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ']') {
                StringBuilder sb = new StringBuilder();
                while (!stack.isEmpty() && stack.peek().charAt(0)!= '[') {
                    sb.insert(0, stack.pop());
                }
                stack.pop();
                StringBuilder digits = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                    digits.insert(0, stack.pop());
                }
                int count = Integer.parseInt(digits.toString());
                StringBuilder decoded = new StringBuilder();
                for (int k = 0; k < count; k++) {
                    decoded.append(sb);
                }
                stack.push(decoded.toString());
            } else {
                stack.push(String.valueOf(c));
            }
        }

        for (String r : stack) {
            ans.append(r);
        }
        return ans.toString();
    }
    public static void main(String[] args) {

    }
}
