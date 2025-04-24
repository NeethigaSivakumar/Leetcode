package com.example.Stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        String operands="+-*/";
        for(String i:tokens){
            if(operands.contains(i)){
                int a=stack.pop();
                int b=stack.pop();
                if(i.charAt(0)=='+'){
                    stack.push(a+b);
                }
                else if(i.charAt(0)=='-'){
                    stack.push(a-b);
                }
                else if(i.charAt(0)=='*'){
                    stack.push(a*b);
                }
                else{
                    stack.push(a/b);
                }
            }
            else{
                stack.push(Integer.valueOf(i));
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {

    }
}
