#include <iostream>
#include<string>
#include <boost/algorithm/string.hpp>
#include <stack>
using namespace std;
string reverseWords(string s) {
         size_t found = s.find("  ");
         while(found!=string::npos)
         {
             boost::replace_all(s,"  "," ");
             found = s.find("  ");
         }
         stack<string> store;
         string res="";
         for(unsigned int i=0;i<s.length();i++)
         {
             if(s[i]==' ')
             {
                 store.push(res);
                 res="";
             }
             else
             {
                 res+=s[i];
             }
         }
         if(res.size())
             store.push(res);
         res="";
         while(!store.empty())
         {
             res+=store.top();
             res+=" ";
             store.pop();
         }
        return res;
    }
int main()
{
     string s = "Alice does not even like bob";
    cout<<reverseWords(s)<<endl;
    return 0;
}
