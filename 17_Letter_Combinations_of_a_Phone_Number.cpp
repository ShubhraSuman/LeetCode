class Solution {
public:
    queue<string> q;
    void helper(string str)
    {
        if(q.size()==0)
        {
            for(int i=0;i<str.size();i++)
            {
                char c=str[i];
                string x;
                x=c;
                q.push(x);
            }
        }
        else
        {
            int size=q.size();
            while(size--)
            {
            string element=q.front();
                q.pop();
            for(int i=0;i<str.length();i++)
            {
                q.push(element+str[i]);
            }
            }
        }
    }
    vector<string> letterCombinations(string digits) {
        map<char,string> mp;
        mp['1']="";
        mp['2']="abc";
        mp['3']="def";
        mp['4']="ghi";
        mp['5']="jkl";
        mp['6']="mno";
        mp['7']="pqrs";
        mp['8']="tuv";
        mp['9']="wxyz";
        vector<string> answer;
        for(int i=0;i<digits.size();i++)
            answer.push_back(mp[digits[i]]);
        for(int i=0;i<answer.size();i++)
        {
            helper(answer[i]); 
        }
        answer.clear();
        while(!q.empty())
        {
            answer.push_back(q.front());
            q.pop();
        }
        return answer;
    }
};