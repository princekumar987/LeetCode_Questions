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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        
        List<Integer>ans=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root1!=null)
        q.add(root1);

        while(q.size()>0){
             int size=q.size();
             while(size-->0){
                  TreeNode n=q.remove();
                  ans.add(n.val);
                  if(n.left!=null)q.add(n.left);
                  if(n.right!=null)q.add(n.right);
             }
        }
        if(root2!=null)
        q.add(root2);
        
        while(q.size()>0){
             int size=q.size();
             while(size-->0){
                  TreeNode n=q.remove();
                  ans.add(n.val);
                  if(n.left!=null)q.add(n.left);
                  if(n.right!=null)q.add(n.right);
             }
        }

        Collections.sort(ans);

        return ans;

        
    }
}