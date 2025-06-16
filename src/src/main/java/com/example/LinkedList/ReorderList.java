package com.example.LinkedList;

public class ReorderList {

    public void reorderList(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        while(slow!=null){
            ListNode temp=slow.next;
            slow.next=prev;
            prev=slow;
            slow=temp;
        }
        ListNode first=head,second=prev;
        while(second.next!=null){
            ListNode first1=first.next,second1=second.next;
            first.next=second;
            second.next=first1;
            first=first1;
            second=second1;
        }
    }
}
