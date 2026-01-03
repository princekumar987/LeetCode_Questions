/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

          if(head==null || head.next==null)return head;
          
          int count=0;
          ListNode temp=head;

          while(temp!=null){
              count++;
              temp=temp.next;
          }

          k=k%count;
          if(k==0)return head;
          k=count-k-1;

          temp=head;

          while(k-->0){
              temp=temp.next;
          }
          ListNode a=temp;
          ListNode p=temp.next;
          ListNode temp1=p;

          while(temp1.next!=null){
              temp1=temp1.next;
          }

          temp1.next=head;
          a.next=null;


          return p;
    }
}