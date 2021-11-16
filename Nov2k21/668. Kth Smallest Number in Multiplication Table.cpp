/* 
Range based search
Algorithm:

1) low = 1 high = m*n;
Next we will find middle element and check the number if element whcih is less than or equal to mid.
Then will check the count with k.
*/
class Solution {
public:
    int count(int mid,int m,int n)
    {
        int c = 0;
        for(int i=1;i<=m;i++)
        {
            c += min(mid/i,n);
        }
        return c;
    }
    int findKthNumber(int m, int n, int k) {
        int low = 1, high= m*n;
        while(low<high)
        {
            int mid = low+(high-low)/2;
            int capacity = count(mid,m,n);
            if(capacity>=k)
            {
                high = mid;
            }
            else
            {
                low =  mid+1;
            }
        }
        return low;
    }
};
