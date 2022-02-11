class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq1 = new int[26]; //To store Freq of s2
        int[] freq2 = new int[26]; //To store Freq of s2
        
        char charArray1[] = s1.toCharArray(); //Converting string(s1) to charArray
        char charArray2[] = s2.toCharArray(); //Converting string(s2) to charArray
        
        //IF length of s1 is more than s2
        if(s1.length()>s2.length())
            return false;
         int left=0,right=0;
        while(right<s1.length())
        {
            freq1[charArray1[right]-'a']++;
            freq2[charArray2[right]-'a']++;
            right++;
        }
        
        right -=1; 
        while(right<s2.length())
        {
            if(Arrays.equals(freq2, freq1)) 
                return true;
            right+=1;
            if(right!=s2.length())
                 freq2[charArray2[right]-'a']++;
             freq2[charArray2[left]-'a']--;
            left+=1;
        }
        return false;
    }
}
