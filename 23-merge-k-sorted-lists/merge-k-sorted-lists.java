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

    static ListNode merge(ListNode l1, ListNode l2){
           
           ListNode dummy=new ListNode(0);
           ListNode curr=dummy;

           while(l1!=null && l2!=null){
                 
                 if(l1.val<=l2.val){
                    curr.next=l1;
                    curr=l1;
                    l1=l1.next;
                 }
                 else{
                    curr.next=l2;
                    curr=l2;
                    l2=l2.next;
                 }

           }

           while(l1!=null){
               curr.next=l1;
               curr=l1;
               l1=l1.next;
           }

           while(l2!=null){
              curr.next=l2;
              curr=l2;
              l2=l2.next;
           }

           return dummy.next;


    }

    static ListNode merge(ListNode[] lists,int  start, int end){
           
           if(start==end)return lists[start];

           int mid=start+(end-start)/2;

           ListNode l1=merge(lists,start,mid);
           ListNode l2=merge(lists,mid+1,end);

           return merge(l1,l2);
    }

    public ListNode mergeKLists(ListNode[] lists) {
          
          if(lists==null || lists.length==0)return null;

          return merge(lists,0,lists.length-1);

    }
}