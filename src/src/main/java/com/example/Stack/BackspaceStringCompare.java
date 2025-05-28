package com.example.Stack;

import java.util.Stack;

//maximum length of string
//what happend if both are empty string
//how to handle if start index of string is #
public class BackspaceStringCompare
{
    public boolean backspaceCompare(String s, String t) {
        return form(s).equals(form(t));
    }

    public String form(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        BackspaceStringCompare b=new BackspaceStringCompare();
        b.backspaceCompare("a##b","a#b#");
    }

}
