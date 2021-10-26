1) Solution - 1
class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        vector<int> ans;
        for(int i=0;i<nums.size();i++)
        {
            auto it = find(nums.begin()+i+1,nums.end(),nums[i]);
            if(it!=nums.end())
            {
                ans.push_back(*it);
            }
        }
        return ans;
    }
};

2) Solution - 2

class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        vector<int> ans;
        for(int i=0;i<nums.size();i++)
        {
            int index = abs(nums[i]);
            if(nums[index-1]<0)
            {
                ans.push_back(index);
            }
            nums[index-1]*=-1;
        }
        return ans;
    }
};