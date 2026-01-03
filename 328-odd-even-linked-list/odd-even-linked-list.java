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
    public ListNode oddEvenList(ListNode head) {
         
         if(head==null || head.next==null)return head;
         List<Integer>list=new ArrayList<>();

         ListNode temp=head;

         while(temp!=null){
                list.add(temp.val);
                if(temp.next==null || temp.next.next==null)break;
                temp=temp.next.next;
         }

         temp=head.next;

         while(temp!=null){
              list.add(temp.val);
              if(temp.next==null || temp.next.next==null)break;
              temp=temp.next.next;
         }

         temp=head;
         int i=0;

         while(temp!=null){
            temp.val=list.get(i++);
            temp=temp.next;
         }


         return head;

    }
}