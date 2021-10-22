class Solution {
public:
    int LCS(string s1,string s2,int n,int m)
    {
        if(n==0||m==0)
            return 0;
        if(s1[n-1]==s2[m-1])
           return 1+LCS(s1,s2,n-1,m-1);
        else
            return max(LCS(s1,s2,n-1,m),LCS(s1,s2,n,m-1));
    }
    int longestCommonSubsequence(string text1, string text2) {
        int n= text1.size();
        int m= text2.size();
       return  LCS(text1,text2,n,m);
    }
};