package com.example.Stack;

import java.util.Deque;
import java.util.LinkedList;

//will array contains any other operations unexpected
//if array is empty, what should be returned for pop() and peek()
//will array contain null values
//input size
//space O(n)
class ImplementStackUsingQueue {

    Deque<Integer> deque;

    public ImplementStackUsingQueue() {
        deque = new LinkedList<>();
    }

    //O(1)
    public void push(int x) {
        deque.offerLast(x);
    }

    //O(1)
    public int pop() {
        if(deque.isEmpty()){
            return -1;
        }
        return deque.pollLast();
    }

    //O(1)
    public int top() {
        if (deque.isEmpty()) {
            return -1;
        }
        return deque.peekLast();
    }

    //O(1)
    public boolean empty() {
        return deque.isEmpty();
    }

}
