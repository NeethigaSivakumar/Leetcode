package com.example.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {

    //stack
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
        for (char c:s.toCharArray()){
            if(map.containsValue(c)){
                stack.push(c);
            }
            else if(map.containsKey(c)){
                if(stack.isEmpty() || map.get(c)!=stack.pop()){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        isValid("()");

    }
}
