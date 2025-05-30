package com.example.LinkedList;

//TimeO(NlogK) Space O(k)
class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = new ListNode(0);
        if (lists == null || lists.length == 0) {
            return res.next;
        }
        return mergeKLists(lists, 0, lists.length - 1);

    }

    public ListNode mergeKLists(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }
        int mid = start + (end - start) / 2;
        ListNode l1 = mergeKLists(lists, start, mid);
        ListNode l2 = mergeKLists(lists, mid + 1, end);
        return mergeTwoListNode(l1, l2);
    }

    public ListNode mergeTwoListNode(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(0);
        ListNode ans = res;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                res.next = list1;
                list1 = list1.next;
            } else {
                res.next = list2;
                list2 = list2.next;
            }
            res = res.next;

        }
        if (list1 != null) {
            res.next = list1;
        }
        if (list2 != null) {
            res.next = list2;
        }
        return ans.next;
    }

}