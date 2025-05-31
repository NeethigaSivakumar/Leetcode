package com.example.LinkedList;
//if list empty
class MergeTwoSortedLists {
    //Time(O(n+m) Space O(n)
    public ListNode MergeTwoSortedLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        else if(list2==null){
            return list1;
        }
        ListNode ans=new ListNode(0);
        ListNode res=ans;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                res.next=list1;
                list1=list1.next;
            }
            else if(list2.val<list1.val){
                res.next=list2;
                list2=list2.next;
            }
            res=res.next;
        }
        if(list1!=null){
            res.next=list1;
        }
        if(list2!=null){
            res.next=list2;
        }
        return ans.next;
    }
}