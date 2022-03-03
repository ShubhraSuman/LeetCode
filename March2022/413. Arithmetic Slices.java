class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int[] arr = new int[nums.length];
        int c = 0;
        for(int i = 1;i<nums.length-1;i++)
        {
            if((nums[i]-nums[i-1])==(nums[i+1]-nums[i]))
                arr[i+1]= arr[i] + 1;
            c+=arr[i+1];
        }
        return c;
    }
}
