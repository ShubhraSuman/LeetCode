class Solution {
public:
    int minStartValue(vector<int>& nums) {
        int min_sum = 0;
        int sum = 0;
        for(int i=0;i<nums.size();i++)
        {
            sum += nums[i];
            min_sum = min(min_sum,sum);
        }
        return 1-min_sum;
    }
};

//https://www.tutorialcup.com/leetcode-solutions/minimum-value-to-get-positive-step-by-step-sum-leetcode-solution.htm
