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
    private int count = 0;
    public int goodNodes(TreeNode root) {
        goodNodesHelper(root,Integer.MIN_VALUE);
        return count;
    }
    public void goodNodesHelper(TreeNode root,Integer maxSeenSoFar)
    {
        if(root==null)
            return ;
        if(root.val>=maxSeenSoFar)
        {
            maxSeenSoFar = root.val;
            count++;
        }
        goodNodesHelper(root.left,maxSeenSoFar);
        goodNodesHelper(root.right,maxSeenSoFar);
        
    }
}
