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
    public int maxLevelSum(TreeNode root) {

        Queue<TreeNode>q=new LinkedList<>();
        int ans=0;
        int level=1;
        q.add(root);
        int maxsum=Integer.MIN_VALUE;

        while(q.size()>0){
              int size=q.size();
              int sum=0;
              while(size-->0){
                  TreeNode n=q.remove();
                  sum+=n.val;
                  if(n.left!=null)q.add(n.left);
                  if(n.right!=null)q.add(n.right);
              }
              if(sum>maxsum){
                maxsum=sum;
                ans=level;
              }
              level++;
        }


        return ans;
        
    }
}