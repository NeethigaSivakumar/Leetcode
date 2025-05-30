package com.example.LinkedList;

//if head is empty
//if m is 0
// if less elements of m in head
public class DeleteNNodesAfterMNodes {

    public ListNode deleteNNodesAfterMNodes(ListNode head,int m,int n){
        if(head==null || m==0 ){
            return null;
        }
        if(n==0){
            return head;
        }
        ListNode dummy=head;
        while(dummy!=null){
            for(int i=0;i<m-1 && dummy!=null;i++){
                dummy=dummy.next;
            }
            if(dummy==null){
                break;
            }
            ListNode end=dummy.next;
            for(int i=0;i<n && end!=null;i++){
                end=end.next;
            }
            dummy.next=end;
            dummy=end;
        }
        return head;
    }
}
