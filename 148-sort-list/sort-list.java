/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    static ListNode findMiddle(ListNode head){
         
         ListNode slow=head;
         ListNode fast=head.next;

         while(fast!=null && fast.next!=null){
              slow=slow.next;
              fast=fast.next.next;
         }

         return slow;
    }

    static ListNode mergeSortedList(ListNode list1,ListNode list2){

         ListNode head=new ListNode(-1);
         ListNode temp1=list1;
         ListNode temp2=list2;
         ListNode temp=head;

         while(temp1!=null && temp2!=null){
               
               if(temp1.val>=temp2.val){
                    temp.next=temp2;
                    temp=temp.next;
                    temp2=temp2.next;
               }
               else{
                   temp.next=temp1;
                   temp=temp.next;
                   temp1=temp1.next;
               }
         }  

         while(temp1!=null){
            temp.next=temp1;
            temp=temp.next;
            temp1=temp1.next;
         }

         while(temp2!=null){
            temp.next=temp2;
            temp=temp.next;
            temp2=temp2.next;
         }

        return  head.next;

    }

    public ListNode sortList(ListNode head) {

        if(head==null || head.next==null) return head;

        ListNode middle=findMiddle(head);
        ListNode right=middle.next;
        middle.next=null;

        head=sortList(head);
        right=sortList(right);

        return mergeSortedList(head,right);   
    }
}