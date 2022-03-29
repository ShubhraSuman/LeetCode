class Solution {
    public int findDuplicate(int[] nums) {
        
        for(int i = 0;i<nums.length;i++)
        {
            int curElement = nums[i]>0 ? nums[i] : (-1 *nums[i]);
            if(nums[curElement]<0)
            {
                return nums[i]>0 ? nums[i] : (-1 *nums[i]);
            }
            else
            {
                nums[curElement] = -1 * nums[curElement];
            }
        }
        return -1;
    }
}


/* 
[1,-3,-4,-2,-2]
 0 1 2 3 4
 [1,-3,-4,-2,-2]

[3,-1,3,-4,2]
 0 1 2 3 4
 
*/
