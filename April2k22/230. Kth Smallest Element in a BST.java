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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode curr = root;
        while(curr!=null || st.size()>0)
        {
            while(curr!=null)
            {
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            if(k==1)
                return curr.val;
            k--;
            curr = curr.right;
        }
        return -1;
    }
}
