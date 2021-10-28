/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

class Solution {
public:
    int guessNumber(int n) {
        int low = 1;
        int high = n;
        int mid = low+(high-low)/2;
        cout<<mid<<endl;
        int res = guess(mid);
        cout<<"res"<<res<<endl;
        while(low<=high)
        {
            if(res==1)
            {
                low = mid+1;
            }
            else if(res==-1)
            {
                high = mid -1;
            }
            else if(res==0)
            {
                break;
            }
            mid = low+(high-low)/2;
            cout<<mid<<endl;
            res = guess(mid);
            cout<<"res"<<res<<endl;
        }
        return mid;
    }
};
