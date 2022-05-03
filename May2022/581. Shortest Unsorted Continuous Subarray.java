class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int end = 1;
        int st = 0;
        int max = nums[0];
        int min = nums[nums.length-1];
        for(int i = 1;i<nums.length;i++)
        {
            // From starting search for max 
            // if there is any number which is less than max
            // thst is the starting point
            // Since arry is sorting in ascending order we are searching for max.
            if(max>nums[i])
            {
                st = i;
            }
            else
            {
                max = nums[i];
            }
        }
        for(int j = nums.length-2;j>=0;j--)
        {
            if(min<nums[j])
            {
                end = j;
            }
            else
            {
                min = nums[j];
            }
        }
        return st-end+1;
    }
}
