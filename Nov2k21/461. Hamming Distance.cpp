/*
To find hamming distance between two numbers :
- Find xor of both the numbers.
- Calculate the number of 1 in the bit.
- 0^0 = 0
- 1^1 = 0
 x = 1, y = 4
 
x = 0 0 0 1
y = 0 1 0 0
------------
x^y =  0 1 0 1
Ans = 2
*/
class Solution {
public:
    int hammingDistance(int x, int y) {
        int xorOfBoth = x^y;
        int count = 0;
        for(int i =31;i>=0;i--)
        {
            int mask = 1<<i;
            if(mask&xorOfBoth)
                count++;
        }
        return count;
    }
};

class Solution {
public:
    int hammingDistance(int x, int y) {
        
        int cnt{};
        int xr = x^y;
        
        return __builtin_popcount(xr);
    }
};
