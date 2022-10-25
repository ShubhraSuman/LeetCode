class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="";
        String s2="";
        int i=0,j=0;
        while(i<word1.length || j<word2.length)
        {
            if(i<word1.length)
            s1+= word1[i++];
            if(j<word2.length)
            s2+= word2[j++];
        }
        System.out.println(s1 + " " + s2);
        if(s1.equals(s2))
            return true;
        return false;
    }
}