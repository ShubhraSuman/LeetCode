/* Modulo supports the property of assciativity 
A = 2
B = 4
C = 8
C%B = 0
B%A = 0
Then C%A = 0
Nums[] = 1 , 4, 5, 8, 12, 9
After sorting
Nums[] = 1, 4 , 5, 8, 9, 12
Each element itself is a subset since nums[i]%nums[i] = 0
Count[] = [1,1,1,1,1,1]
Algorithm:
1) Check for 1:
Since no element to left of it so no check req.

2) Check for 4:
4%1=0
We will be extracting max of count[j]+1,count[i] beacause either i%j can happen or j%i can occur.
So count[j] = max(count[j]+1,count[i])
count[4(at index 1 )] = max(count[1],count[0]+1)
count[1] = max(1,2) = 2
Count[] = [1,2,1,1,1,1]
3) Check for 5:
5%4!=0
5%1=0
count[2] = max(count[2],count[0]+1)
         = max(1,2) = 2
Count[] = [1,2,2,1,1,1]
4) Check for 8:
8%5!=0
8%4=0
count[3] = max(count[3],count[1]+1) = max(1,3) = 3
Count[] = [1,2,2,3,1,1]
8%1 = 0
count[3] = max(count[3],count[0]+1) = max(3,2) = 3

Step 3:
[1,2,2,3,2,3]
maxIndex = 3
Nums[] = 1, 4 , 5, 8, 9, 12
temp = nums[maxIndex]; // nums[3] = 8
currentCount = count[maxIndex]; // count[3] = 3
*/
class Solution {
public:
    vector<int> largestDivisibleSubset(vector<int>& nums) {
        //Step 1
        //Sort the array
        sort(nums.begin(),nums.end());
        
        //Step 2
        vector<int> count(nums.size(),1);
        
        //Step 3
        for(int i=1;i<nums.size();i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(nums[i]%nums[j]==0)
                {
                    count[i] = max(count[i],count[j]+1);
                }
            }
        }
        
        //Step 4
        int maxIndex =0;
        for(int i=1;i<nums.size();i++)
        {
            // maxIndex = max(maxIndex,count[i]);
            maxIndex = count[i]>count[maxIndex]?i:maxIndex;
        }
        
        //Step 5
        vector<int> ans;
        int temp = nums[maxIndex];
        int currentCount = count[maxIndex];
        for(int i=maxIndex;i>=0;i--)
        {
            if(temp%nums[i]==0&&count[i]==currentCount)
            {
                ans.push_back(nums[i]);
                currentCount--;
                temp=nums[i];
                
            }
        }
        
        return ans;
    }
};

