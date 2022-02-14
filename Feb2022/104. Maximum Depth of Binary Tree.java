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
    public int maxDepthCount(TreeNode root, int count)
    {
        if(root==null)
            return 0;
        if(root.left==null&&root.right==null)
            return count;
        return Math.max(maxDepthCount(root.left,count+1),maxDepthCount(root.right,count+1));
    }
    public int maxDepth(TreeNode root) {
        return maxDepthCount(root,1);
    }
}
