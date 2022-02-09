class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        for(int i = 0;i<nums.length;i++)
        {
            if(mp.containsKey(nums[i]))
            {
                mp.put(nums[i],mp.get(nums[i])+1);
            }
            else
            {
                mp.put(nums[i],1);
            }
        }
        int count = 0;
        System.out.println(mp);
        for (Map.Entry mapElement : mp.entrySet()) {
            Integer key = (Integer)mapElement.getKey();
            if(k==0&& mp.containsKey(key)&&mp.get(key)>1)
            {
                count+= 1;
            }
            if(k!=0&&mp.containsKey(key+k))
            {
                count++;
            }
        }
        return count;
    }
}
