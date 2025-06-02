package com.example.LinkedList;

public class IntersectionOfTwoLinkedLists {

    //Time O(n+m) Space O(1)
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA,b=headB;
        while(a!=b){
            a=a!=null?a.next:headB;
            b=b!=null?b.next:headA;
        }
        return a;
    }
}
