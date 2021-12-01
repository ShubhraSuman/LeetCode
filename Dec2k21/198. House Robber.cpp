class Solution {
public:
    int rob(vector<int>& nums) {
        int s1  = 0;
        int s2 = 0;
        for(int i=0;i<nums.size();i++)
        {
            if(i%2)
            {
                s1 = max(s1+nums[i],s2);
            }
            else
            {
                s2 = max(s2+nums[i],s1);
            }
        }
        return max(s1,s2);
    }
};
//https://medium.com/@kaido0121/leetcode-patterns-dynamic-programming-1b65610ce22d
