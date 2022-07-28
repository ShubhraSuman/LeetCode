class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() <= 0 || t.length()<=0 )
            return false;
        Map<Character,Integer> mp = new HashMap<>();
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
        for(char c : arr1)
        {
            if(mp.containsKey(c))
            {
                mp.put(c,mp.get(c)+1);
            }
            else
            {
                mp.put(c,1);
            }
        }
        for(char c: arr2)
        {
            if(mp.containsKey(c))
            {
                // System.out.println(c);
                mp.put(c,mp.get(c)-1);
                if(mp.get(c) == 0)
                {
                    mp.remove(c);
                }
            }
            else
            {
                return false;
            }
        }
        // for(Map.Entry entry: mp.entrySet())
        // {
        //     System.out.println(entry.getKey() + " " + entry.getValue());
        // }
        return mp.isEmpty();
    }
}
