package com.example.LinkedList;

class AddTwoNumbers {

    //Time O(m+n) Space O(n+m)
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null && l2==null){
            return l1;
        }
        else if(l1==null && l2!=null){
            return l2;
        }
        else if(l1!=null && l2==null){
            return l1;
        }
        ListNode ans=new ListNode(0);
        ListNode res=ans;
        int carry=0;
        while(l1!=null || l2!=null){
            int sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            res.next=new ListNode(sum%10);
            res=res.next;
            carry=sum/10;
        }
        while(carry>0){
            res.next=new ListNode(carry%10);
            res=res.next;
            carry=carry/10;
        }
        return ans.next;
    }
}