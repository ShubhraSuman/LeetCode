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
    public static void solve(TreeNode root, int targetSum,List<List<Integer>> res,List<Integer> subList)
    {
        if(root==null)
            return ;
        if(root.left==null && root.right == null)
        {
            if((targetSum - root.val )==0)
            {
                List<Integer> l1 = new ArrayList<>(subList);
                l1.add(root.val);
                res.add(l1);
            }
            return ;
        }
        subList.add(root.val);
        solve(root.left,targetSum - root.val,res,subList);
        solve(root.right,targetSum - root.val,res,subList);
        subList.remove(subList.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        solve(root,targetSum,res,subList);
        return res;
    }
}
