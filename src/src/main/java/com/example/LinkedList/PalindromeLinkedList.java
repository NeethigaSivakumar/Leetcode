package com.example.LinkedList;

public class PalindromeLinkedList {

    //Time O(n) Space O(1)
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode fast=head,slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode reversed=reverse(slow);
        while(reversed!=null){
            if(head.val!=reversed.val){
                return false;
            }
            head=head.next;
            reversed=reversed.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head){
        ListNode prev=null,cur=head;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
}
