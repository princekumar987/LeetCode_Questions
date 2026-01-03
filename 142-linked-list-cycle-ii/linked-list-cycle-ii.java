/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        HashMap<ListNode,Integer>mp=new HashMap<>();

        ListNode temp=head;
        int i=0;
        while(temp!=null){
              if(mp.containsKey(temp))return temp;
              mp.put(temp,i);
              i++;
              temp=temp.next;
        } 

        return null;
    }
}