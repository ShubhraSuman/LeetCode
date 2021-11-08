class Solution {
public:
    int numTrees(int n) {
        vector<int> ans(n+1);
        ans[0] = 1;
        ans[1] = 1;
        if(n>1)
        ans[2] = 2;
        for(int k=3;k<=n;k++)
        {
            ans[k] = 0;
            for(int i=1;i<=k;i++)
            {
                ans[k]+= ans[i-1]*ans[k-i];
            }
        }
        return ans[n];
    }
};
//https://medium.com/@bingabid/96-unique-binary-search-trees-978361fd2ff7
