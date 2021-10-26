1) Solution 1:
 void invTree(TreeNode* root) 
    {
        if(root==NULL || (root->left==NULL&&root->right==NULL))
            return ;
        TreeNode *temp = root->left;
        root->left = root->right;
        root->right = temp;
        invTree(root->left);
        invTree(root->right);
    }
    TreeNode* invertTree(TreeNode* root) {
        invTree(root);
        return root;
    }
2) Solution 2:
TreeNode* invertTree(TreeNode* root) 
    {
        
        if(root==NULL)
           return NULL;
        invertTree(root->left);
        invertTree(root->right);
        
        TreeNode * temp=root->left;
        root->left=root->right;
        root->right=temp;
        
      return root;  
    }