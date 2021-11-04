/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public: void leftLeave(TreeNode* root, int &sum)
        {
           if(root==NULL)
               return ;
           if(root->left && root->left->left==NULL&& root->left->right==NULL)
               sum += root->left->val;
        leftLeave(root->left,sum);
        leftLeave(root->right, sum);
            
    }
    int sumOfLeftLeaves(TreeNode* root) {
        int sum = 0;
        leftLeave(root,sum);
        return sum;
    }
};
