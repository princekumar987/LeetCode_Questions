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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        
        ArrayList<Integer>list=new ArrayList<>();

        ListNode temp=head;

        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        
        int group=1;
        for(int i=0;i<list.size();i=i+group-1){

            int l=i;
            int m=0;
            if(i+group-1>=list.size()){
                m=list.size()-1;
            }else{
                m=i+group-1;
            }
            if((m-l+1)%2==0){
             while(l<m){
                   int p=list.get(l);
                   list.set(l,list.get(m));
                   list.set(m,p);
                   l++;
                   m--;
              }
            }
              group++;
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