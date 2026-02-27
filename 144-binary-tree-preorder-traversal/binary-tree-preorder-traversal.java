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
        public void preOrder(List<Integer> ans, TreeNode root)
        {
        if(root == null)
            return;
        ans.add(root.val);
        preOrder(ans, root.left);
        preOrder(ans, root.right);
        }
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null)
            return ans;
        Stack<TreeNode> stk = new Stack<>();
        stk.push(root);
        while(!stk.isEmpty())
        {
            TreeNode v = stk.pop();
            ans.add(v.val);
            if(v.right != null)
            stk.push(v.right);
            if(v.left != null)
            stk.push(v.left);
        }
    return ans;
    }
}