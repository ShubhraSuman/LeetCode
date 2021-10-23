class Solution {
public:
    bool static comp(pair<char,int> p1,pair<char,int>p2)
    {
        return p1.second >p2.second;
    }
    string frequencySort(string s) {
        map<char,int> mp;
        for(int i=0;i<s.length();i++)
        {
            mp[s[i]]++;
        }
        vector<pair<char,int>> v;
        // sort(mp.begin(),mp.end(),comp);
        for(auto it:mp)
        {
            v.push_back(it);
        }
        sort(v.begin(),v.end(),comp);
        s="";
        for(int i=0;i<v.size();i++)
        {
            while(v[i].second--)
            s+= v[i].first;
        }
        return s;
    }
};