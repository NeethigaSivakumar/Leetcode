package com.example.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// handle unexpected characters other than brackets
// what if string is empty
// max length of the string
public class ValidParenthesis {

    //without using stack
    //Time O(n) Space O(n)
    public static boolean isValid2(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch;
            } else if (ch == ')' && (top < 0 || stack[top--] != '(')) {
                return false;
            } else if (ch == ']' && (top < 0 || stack[top--] != '[')) {
                return false;
            } else if (ch == '}' && (top < 0 || stack[top--] != '{')) {
                return false;
            }
        }
        return top == -1;
    }

    //Using stack
    //Time O(n) Space O(n)
    public static boolean isValid1(String s) {
        Stack<Character> stack=new Stack<>();
        String b="({[}])";
        Map<Character,Character> map=new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(stack.isEmpty() || stack.pop()!=map.get(s.charAt(i))){
                    return false;
                }
            }
            else if(b.indexOf(s.charAt(i))>=0){
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        isValid1("({[]");

    }
}
