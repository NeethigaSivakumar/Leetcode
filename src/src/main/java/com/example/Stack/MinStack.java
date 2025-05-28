package com.example.Stack;

import java.util.Stack;

//Can the values include negative numbers or zero?
//Should getMin() return the correct value even if it appears multiple times?
//And how should we handle calls to top() or getMin() when the stack is empty — return a sentinel value or throw an exception?

//Time O(1) Space O(n)
class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || minStack.peek() >= val) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            int val = stack.pop();
            if (!minStack.isEmpty() && minStack.peek() == val) {
                minStack.pop();
            }
        }
    }

    public int top() {
        return stack.isEmpty() ? -1 : stack.peek();
    }

    public int getMin() {
        return minStack.isEmpty() ? -1 : minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // returns -3
        minStack.pop();
        System.out.println(minStack.top());    // returns 0
        System.out.println(minStack.getMin()); // returns -2
    }
}

