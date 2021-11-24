class Solution {
public:
    vector<vector<int>> intervalIntersection(vector<vector<int>>& firstList, vector<vector<int>>& secondList) {
        vector<vector<int>> ans;
        int n = firstList.size();
        int m =  secondList.size();
        int i = 0 , j = 0;
        while(i<n&&j<m)
        {
            int st = max(firstList[i][0],secondList[j][0]);
            int end = min(firstList[i][1],secondList[j][1]);
            if(end-st>=0)
            {
                ans.push_back({st,end});
            }
            if(firstList[i][1] < secondList[j][1]) i++;
            else  j++;
        }
        return ans;
    }
};
