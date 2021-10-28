class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        vector<vector<int>> ans;
        if(nums.size()<3)
            return {};
        for(int i=0;i<nums.size()-2;i++)
        {
            int st = i+1;
            int end = nums.size()-1;
            if(i==0||nums[i]!=nums[i-1])
            {
                while(st<end)
                {
                    if((nums[i]+nums[st]+nums[end])>0)
                        end--;
                    else if((nums[i]+nums[st]+nums[end])<0)
                        st++;
                    else
                    {
                        vector<int> v;
                        v.push_back(nums[i]);
                        v.push_back(nums[st]);
                        v.push_back(nums[end]);
                        while(st<end && nums[st]==nums[st+1])++st;
                        while(st<end && nums[end]==nums[end-1])--end;
                        ++st;--end;
                        ans.push_back(v);
                    }
                }
            }
        }
        return ans;
    }
};