/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
         
         List<Long>list=new ArrayList<>();
         Queue<TreeNode>q=new LinkedList<>();
         q.add(root);

         while(q.size()>0){
              int size=q.size();
              long sum=0;
              while(size-->0){
                  TreeNode n=q.remove();
                  sum+=n.val;
                  if(n.left!=null)q.add(n.left);
                  if(n.right!=null)q.add(n.right);
              }
              list.add(sum);
         }

         Collections.sort(list);
         Collections.reverse(list);

         if(list.size()>=k) return list.get(k-1);
         return -1;

    }
}