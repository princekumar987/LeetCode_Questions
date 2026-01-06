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
    public int deepestLeavesSum(TreeNode root) {
        
        List<Integer>ans=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();

        q.add(root);

        while(q.size()>0){
             int size=q.size();
             int sum=0;
             while(size-->0){
                 TreeNode t=q.remove();
                 sum+=t.val;
                 if(t.left!=null)q.add(t.left);
                 if(t.right!=null)q.add(t.right);
             }
             ans.add(sum);
        }

        if(ans.size()==0)return 0;
        return ans.get(ans.size()-1);
    }
}