class Solution {
    public boolean search(int[] nums, int target) {
        int st = 0;
        int end = nums.length-1;
        int mid = 0;
        while(st<=end)
        {
            mid = st + (end - st)/2;
            if(nums[mid]==target)
            {
                return true;
            }
            else if(nums[mid]>nums[st]) // left part of mid is sorted
            {
                if(nums[mid]<target || nums[st]>target) //target doesnt lie in this range
                {
                    st= mid+1;
                }
                else
                {
                    end = mid-1;
                }
            }
            else if(nums[mid]<nums[st]) // Right part of mid is sorted
            {
                if(nums[mid]>target ||  nums[end]<target)
                {
                    end = mid-1;
                }
                else
                {
                    st = mid+1;
                }
            }
            else
            {
                st++;
            }
        }
        return false;
    }
}
