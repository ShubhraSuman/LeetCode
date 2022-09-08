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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> l1 = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int size = q.size();
        double sum = 0;
        double count = size;
        while(!q.isEmpty())
        {
            TreeNode temp = q.poll();
            sum += temp.val;
            size--;
            if(temp.left != null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }  
            if(size == 0)
            {
                double avg = sum/count;
                l1.add(avg);
                size = q.size();
                sum = 0;
                count = size;
            }
        }
        return l1;
    }
}
