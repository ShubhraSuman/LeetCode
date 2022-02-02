class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int i = 0;
        int j = p.length();
        List<Integer> list=new ArrayList<Integer>();
        String temp = "";
        char chP[] = p.toCharArray();
        Arrays.sort(chP);
        boolean res = false;
        while(j<=s.length())
        {
            temp = s.substring(i,j);
            char charArray[] = temp.toCharArray();
            Arrays.sort(charArray);
            res = Arrays.equals(charArray, chP);
            if(res)
            {
                list.add(i);
            }
            i++;
            j++;
        }
        return list;
    }
}
