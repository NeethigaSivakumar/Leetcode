package com.example.Stack;

import java.util.Set;
import java.util.Stack;

//too many operands,too many operators
//invalid characters
//input length max size
//input int max size
//negative integers allowed
//if evaluated res exceeds int size
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

    public int evalRPN1(String[] tokens) {
        if (tokens == null || tokens.length == 0) {
            throw new IllegalArgumentException("Input tokens array is null or empty");
        }

        Set<String> operators = Set.of("+", "-", "*", "/");
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (!operators.contains(token)) {
                try {
                    stack.push(Integer.parseInt(token));
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Invalid token: " + token);
                }
            } else {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Not enough operands before operator: " + token);
                }

                int a = stack.pop(); // right operand
                int b = stack.pop(); // left operand

                switch (token) {
                    case "+":
                        stack.push(b + a);
                        break;
                    case "-":
                        stack.push(b - a);
                        break;
                    case "*":
                        stack.push(b * a);
                        break;
                    case "/":
                        if (a == 0) {
                            throw new ArithmeticException("Division by zero");
                        }
                        stack.push(b / a);
                        break;
                }
            }
        }
        if (stack.size() != 1) {
            throw new IllegalStateException("Invalid RPN expression. Final stack: " + stack);
        }

        return stack.pop();
    }

    public static void main(String[] args) {

    }
}
