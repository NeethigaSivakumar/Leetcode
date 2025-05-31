package com.example.LinkedList;

class ReverseNodesInKGroups {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;
        while (true) {
            ListNode kth = prevGroupEnd;
            for (int i = 0; i < k && kth != null; i++) {
                kth = kth.next;
            }
            if (kth == null) {
                break;
            }
            ListNode groupStart=prevGroupEnd.next;
            ListNode nextGroupStart = kth.next;
            ListNode cur = groupStart, prev = nextGroupStart;
            while (cur != nextGroupStart) {
                ListNode temp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = temp;
            }
            prevGroupEnd.next = kth;
            prevGroupEnd = groupStart;
        }
        return dummy.next;
    }
}