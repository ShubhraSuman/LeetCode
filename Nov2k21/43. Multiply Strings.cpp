class Solution {
public:
    string multiply(string num1, string num2) {
        int l1 = num1.length();
        int l2 = num2.length();
        if(num1 == "0" || num2== "0")
            return "0";
        if(num1=="1")
            return num2;
        if(num2=="1")
            return num1;
        
        int i = l2-1;
        vector<int> res(l1+l2);
        int jval,product;
        int k,j,ival,carry;
        int pf = 0; //Power factor
        while(i>=0)
        {
            ival = num2[i] - '0';
            j = l1 - 1;
            k = res.size() - 1 - pf;
            carry = 0;
            while(j>=0 || carry!=0)
            {
                jval = j>=0 ? num1[j]-'0':0;
                product = ival*jval + carry + res[k];
                // cout<<"product: "<<product<<endl;
                res[k] = product % 10;
                // cout<<"res[k] "<<res[k]<<endl;
                carry = product/10;
                // cout<<"carry "<<carry<<endl;
                j--;
                k--;
            }
            i--;
            pf++;
        }
        string ans = "";
        for(k = 0 ; k<res.size();k++)
        {
            if(res[k]==0&&ans.length()==0)
                continue;
            else
            {
                // cout<<res[k]<<endl;
                ans += to_string(res[k]);
            }
        }
        return ans; 
    }
};
