class Solution {
    public int threeSumMulti(int[] arr, int target) {
      Map<Integer, Long> mp = new HashMap<>();
        for (Integer c : arr) {
			long freq = mp.getOrDefault(c,0L);
            mp.put(c,freq+1L);
		}
        long ans = 0;
        for(Integer el1 : mp.keySet())
        {
            for(Integer el2 :  mp.keySet())
            {
                int el3 = target - el1 - el2;
                // System.out.println("Value of el3 "+ el3);
                if(mp.containsKey(el3))
                {
                    long freq1 = mp.get(el1);
                    long freq2 = mp.get(el2);
                    long freq3 = mp.get(el3);
                    // System.out.println("Value of el1 "+ el1);
                    // System.out.println("Value of el2 "+ el2);
                    // System.out.println("Value of el3 "+ el3);
                    if(el1 == el2 && el2 == el3)
                    {
                        ans += (freq1 * (freq1-1) * (freq1-2))/6;
                    }
                    else if(el1 == el2 && el1 != el3)
                    {
                        ans += (freq1 * (freq1-1))/2 *freq3;
                    }
                    else if(el1<el2 && el2<el3)
                    {
                        // System.out.println("Value of not equal "+ ans);
                        ans += freq1*freq2*freq3;
                    }
                    // System.out.println("Value of ans "+ ans);
                }
                 ans = ans%1000000007;
            }
           
        }
        return (int)ans;
    }
}
