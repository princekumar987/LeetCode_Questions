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
    public boolean isPalindrome(ListNode head) {

        if(head==null || head.next==null)return true;
          
          ListNode slow=head;
          ListNode fast=head;

          while(fast.next!=null && fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
          }
          
          ListNode prev=slow;
          ListNode temp=slow.next;
          slow.next=null;

          while(temp!=null){
               ListNode front=temp.next;
               temp.next=prev;
               prev=temp;
               temp=front;
          } 

          temp=head;

          while(temp!=null){
              if(temp.val!=prev.val)return false;
              temp=temp.next;
              prev=prev.next;
          }

          return true;
          
        
    }
}