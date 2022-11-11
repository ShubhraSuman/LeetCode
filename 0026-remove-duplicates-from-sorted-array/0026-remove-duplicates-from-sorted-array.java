class Solution {
    public int removeDuplicates(int[] nums) {
        int curEle = 0;
        int uniqEle = 0;
        int len = 0;
        for(int i = 1;i<nums.length;i++)
        {
            if(nums[i]!=nums[uniqEle])
            {
                curEle++;
                uniqEle++;
                nums[curEle] = nums[i];
                len++;
            }
        }
        return len+1;
    }
}