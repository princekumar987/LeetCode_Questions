
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

import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode head=new ListNode(0);
        ListNode newtemp=head;
        
        int carry=0;
        int sum=0;
        while(temp1!=null || temp2!=null ){
             
             if(temp1!=null){
                 sum+=temp1.val;
                 temp1=temp1.next;
             }

             if(temp2!=null){
                 sum+=temp2.val;
                 temp2=temp2.next;
             }

             sum+=carry;

             int x=sum%10;
             carry=sum/10;
             sum=0;

             ListNode a=new ListNode(x);
             newtemp.next=a;
             newtemp=newtemp.next;
        }

        if(carry>0){
             ListNode a=new ListNode(carry);
             newtemp.next=a;
             newtemp=newtemp.next;
        }

        return head.next;
       
    }
}