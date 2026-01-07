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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        Stack<TreeNode>st=new Stack<>();
        Stack<Integer>temp=new Stack<>();
        List<Integer>ans=new ArrayList<>();

        if(root==null)return ans;
        st.push(root);

        while(st.size()>0){
              TreeNode p=st.pop();
              temp.push(p.val);
              if(p.left!=null)st.push(p.left);
              if(p.right!=null)st.push(p.right);  
        }

        while(temp.size()>0){
            ans.add(temp.pop());
        }

        return ans;
    }
}