package com.example.LinkedList;

class Node{
    int key;
    int val;
    Node prev;
    Node next;

    Node(int key,int val){
        this.key=key;
        this.val=val;
        prev=null;
        next=null;
    } 
}