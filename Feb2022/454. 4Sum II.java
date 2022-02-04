class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> mp
            = new HashMap<Integer, Integer>();
        for(int i = 0;i<nums1.length;i++)
        {
            for(int j = 0;j<nums2.length;j++)
            {
                int sum = nums1[i] + nums2[j];
                mp.put(sum,mp.getOrDefault(sum,0)+1);
            }
        }
        int res = 0;
        for(int i = 0;i<nums3.length;i++)
        {
            for(int j = 0;j<nums4.length;j++)
            {
                int sum = nums3[i] + nums4[j];
                if(mp.containsKey(-sum))
                {
                    res += mp.get(-sum);
                }
            }
        }
        return res;
    }
}
