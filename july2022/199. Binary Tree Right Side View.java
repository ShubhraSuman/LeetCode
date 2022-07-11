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
    public List<Integer> rightSideView(TreeNode root) {
         Queue<TreeNode> q = new LinkedList<>();
         q.add(root);
         List<Integer> ans = new ArrayList<Integer>();  
         if(root==null)
             return ans;
         int size = q.size();
         while(!q.isEmpty())
         {
             TreeNode temp = q.peek(); 
             q.poll();
             size--;
             if(temp.left!=null)
             {
                 q.add(temp.left);
             }
             if(temp.right!=null)
             {
                 q.add(temp.right);
             }
             if(size==0)
             {
                 size = q.size();
                 ans.add(temp.val);
             }
         }
        return ans;
    }
}
