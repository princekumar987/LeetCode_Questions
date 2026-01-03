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


    static ListNode reverse(ListNode head,ListNode prev){

        if(head==null)return prev;

        ListNode temp=head;
        ListNode front=head.next;
        temp.next=prev;
        prev=temp;
        temp=front;

        return reverse(temp,prev);

    }
    public ListNode reverseList(ListNode head) {

         return reverse(head, null);
        

    }
}