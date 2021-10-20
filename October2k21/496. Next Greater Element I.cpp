class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        vector<int> ans;
        for(auto x:nums1)
        {
             auto it = find(nums2.begin(), nums2.end(), x);
             int index = it - nums2.begin();
             bool flag = false;
             for(int i = index;i<nums2.size();i++)
             {
                 if(nums2[i]>x)
                 {
                    ans.push_back(nums2[i]);  
                    flag=true;
                    break;
                 }
             }
             if(!flag)
             {
                 ans.push_back(-1);
                 flag=true;
             }
        }
        return ans;
    }
};