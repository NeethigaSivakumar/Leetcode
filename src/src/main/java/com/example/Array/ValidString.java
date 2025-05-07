package com.example.Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidString {
    public static String validateString(String s){
        Stack<Character> stack=new Stack<>();
        Map<Character,Character> map=new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        for(char i:s.toCharArray()){
            if(map.containsKey(i)){
                if(stack.isEmpty() || !stack.pop().equals(map.get(i))) {
                    return "Not Balanced";
                }
            }
            else{
                stack.push(i);
            }
        }
        return stack.isEmpty()?"Balanced":"Not Balanced";
    }

    public static void main(String[] args) {
        System.out.println(validateString("([{}()])"));
        System.out.println(validateString("[[(}})]]"));
        System.out.println(validateString("([{(})])"));
    }
}
