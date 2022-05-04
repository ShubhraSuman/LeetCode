class Solution {
    public int maxOperations(int[] nums, int k) {
        int count = 0;
        Arrays.sort(nums);
        int st = 0;
        int end = nums.length-1;
        while(st<end)
        {
            if((nums[st]+nums[end]) == k)
            {
                count++;
                st++;
                end--;
            }
            else if((nums[st]+nums[end])<k)
            {
                st++;
            }
            else 
            {
                end--;
            }
        }
        return count;
    }
}

/*
1 3 3 3 4
1 2 3 4 k = 5

*/
