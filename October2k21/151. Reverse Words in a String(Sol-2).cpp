class Solution {
public:
    string reverseWords(string s) {
        stack<string>st;
        //used to break word
        stringstream ss(s);
        string word;
        while(ss>>word)
            st.push(word);
        string res;
        while(!st.empty())
        {
            res+=st.top();
            res+=" ";
            st.pop();
        }
        res.pop_back();//to remove space after last word
        return res;
    }
};