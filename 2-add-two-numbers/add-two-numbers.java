
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
        ListNode dummy=new ListNode(0);
        int rem=0;
        ListNode curr=dummy;
        while(l1!=null && l2!=null){
               int x=l1.val+l2.val+rem;
               rem=x/10;
               x=x%10;
               ListNode l=new ListNode(x);
               curr.next=l;
               curr=l;
               l1=l1.next;
               l2=l2.next;
        }

        while(l1!=null){
             int x=rem+l1.val;
             rem=x/10;
             x=x%10;
             ListNode l=new ListNode(x);
             curr.next=l;
             curr=l;
             l1=l1.next;
        }

        while(l2!=null){
             int x=rem+l2.val;
             rem=x/10;
             x=x%10;
             ListNode l=new ListNode(x);
             curr.next=l;
             curr=l;
             l2=l2.next;
        }

        if(rem>0){
            ListNode l=new ListNode(rem);
            curr.next=l;
        }


        return  dummy.next;
       
    }
}