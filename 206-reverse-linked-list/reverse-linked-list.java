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
    public ListNode reverseList(ListNode head) {

        if(head==null)return null;
         
         ListNode temp=head;
         List<Integer>list=new ArrayList<>();

         while(temp!=null){
               list.add(temp.val);
               temp=temp.next;
         }

         head=new ListNode(list.get(list.size()-1));
         temp=head;
         for(int i=list.size()-2;i>=0;i--){
            ListNode p=new ListNode(list.get(i));
            temp.next=p;
            temp=temp.next; 
         }

         return head;
    }
}