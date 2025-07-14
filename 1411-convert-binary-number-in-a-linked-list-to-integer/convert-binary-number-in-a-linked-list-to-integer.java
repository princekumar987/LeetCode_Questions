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
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer>list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
             list.add(temp.val);
             temp=temp.next;
        }
        int j=0;
        int ans=0;
       for(int i=list.size()-1;i>=0;i--){
         ans=ans+list.get(i)*(int)Math.pow(2,j);
         j++;
       } 
       return ans;
    }
}