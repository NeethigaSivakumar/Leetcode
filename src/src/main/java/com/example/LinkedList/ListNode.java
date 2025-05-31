package com.example.LinkedList;

public class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    public ListNode(int val, ListNode node) {
        this.val = val;
        this.next = node;
    }
    public ListNode(int val, ListNode next,ListNode prev) {
        this.val = val;
        this.next = next;
        this.prev=prev;
    }
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode() {
    }

}
