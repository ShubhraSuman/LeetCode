class Solution {
    public int minDeletions(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        
        for(int i = 0;i<s.length();i++)
        {
            if(mp.containsKey(s.charAt(i)))
            {
                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            }
            else
            {
                mp.put(s.charAt(i),1);
            }
        }
        int delCount = 0;
        Set<Integer> set = new HashSet<>();
        for (Integer ele : mp.values()) 
        {
            if(!set.contains(ele))
            {
                set.add(ele);
            }
            else
            {
              
                while(ele>0 &&set.contains(ele))
                {
                    ele--;
                     delCount++; 
                }
               set.add(ele);
            } 
            
        }
        return delCount;
    }
}
