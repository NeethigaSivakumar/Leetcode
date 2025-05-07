package com.example.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {

    //stack
    public static boolean isValid(String s) {
        if(s.length()%2==1){
            return false;
        }
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

    public static boolean isValid1(String s) {
        if(s.length()%2!=0){
            return false;
        }
        char[] ch=new char[s.length()];
        int top=-1;
        for(char c:s.toCharArray()){
            if(c=='('){
                ch[++top]=')';
            }
            else if(c=='{'){
                ch[++top]='}';
            }
            else if(c=='['){
                ch[++top]=']';
            }
            else{
                if(top==-1 || ch[top--]!=c){
                    return false;
                }
            }
        }
        return top==-1;
    }

    public static void main(String[] args) {
        isValid1("(){}[]");

    }
}
