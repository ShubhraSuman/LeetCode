class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
         int ans = nums[0];
         //XOR whole array and store the xor of elements present only once
         for(int i=1;i<nums.size();i++)
         {
             ans ^= nums[i];
         }
         // Now we need to extract the 1st set bit from right
         int mask = 1;
         for(int i=0; i<32; i++)
         {
            if(ans & mask)
                break;
            //Left shift mask
            mask <<= 1;
        }
        int a=0,b=0;
        for(int x : nums){
            if(x & mask)
                a ^= x;
            else
                b ^= x;
        }
        
        return {a,b};
    }
};

//[1,2,1,3,2,5]
//[3,5]
// 3 - 011
// 5 - 101
//---------------
//    - 110
//  110
// &  1(Do left shift and find 1st set bit)
//------------------
//  110
//  &10
//-----------
//  100


