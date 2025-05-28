package com.example.Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

//will array contains any other operations unexpected
//if array is empty, what should be returned for pop() and peek()
//will array contain null values
//input size
//Space O(n)
class ImplementQueueUsingStack {

    Stack<Integer> input;
    Stack<Integer> output;

    public ImplementQueueUsingStack() {
        input = new Stack<>();
        output = new Stack<>();
    }

    //O(1)
    public void push(int x) {
        input.push(x);
    }

    //O(1)
    public int pop() {
        getOutputStack(input);
        return output.pop();
    }

    public void getOutputStack(Stack<Integer> input) {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
    }

    //O(1)
    public int peek() {
        getOutputStack(input);
        return output.peek();
    }

    //O(1)
    public boolean empty() {
        return input.empty() && output.empty();
    }
}