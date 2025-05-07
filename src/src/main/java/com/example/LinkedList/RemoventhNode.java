package com.example.LinkedList;

public class RemoventhNode {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode left=dummy,right=dummy;
        for(int i=0;i<=n;i++){
            right=right.next;
        }
        while(right!=null){
            left=left.next;
            right=right.next;
        }
        left.next=left.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode node1=new ListNode(2);
        head.next=node1;
        ListNode node2=new ListNode(3);
        node1.next=node2;
        ListNode node3=new ListNode(4);
        node2.next=node3;
        ListNode node4=new ListNode(5);
        node3.next=node4;

        ListNode temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }

        ListNode h = removeNthFromEnd(head, 2);
        while (h != null) {
            System.out.println(h.val);
            h = h.next;
        }
    }

}
