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
    public ListNode reverseKGroup(ListNode head, int k) {

        ArrayList<Integer>list=new ArrayList<>();

        ListNode temp=head;

        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }

        for(int i=0;i<list.size()-k+1;i=i+k){

            int l=i;
            int m=i+k-1;
             if(m-l+1==k){
              while(l<m){
                   int p=list.get(l);
                   list.set(l,list.get(m));
                   list.set(m,p);
                   l++;
                   m--;
              }
             }
        }

        temp=head;
        int i=0; 
        while(temp!=null){
            temp.val=list.get(i);
            i++;
            temp=temp.next;
        }


        return head; 
        
    }
}