class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int res = 0;
        for(int i=0;i<32;i++)
        {
            int count = 0;
            int mask = 1<<i; //(left shift)
            for(auto x:nums)
            {
                if(mask&x)
                    count++;
            }
            if(count%3)
                res = res|mask;
        }
        return res;
    }
};
//https://leetcode.com/problems/single-number-ii/discuss/1562448/Easy-Solution-With-Explanation

