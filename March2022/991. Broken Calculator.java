class Solution {
    
    public int brokenCalc(int s, int t) {
        int res = 0;
        while(t>s)
        {
            if((t%2)==0)
            {
                t = t/2;
            }
            else
            {
                t = t+1;
            }
            res++;
        }
       
        return res+(s-t);
    }
}

/* 
s = 4
t = 3

res = 1;


s = 3
t = 10

3*2 = 6
6 - 1 = 5
5*2 = 10

ans => 3

s = 2
t = 3
2*2 = 4 , 2-1 = 1
4 - 1 = 3
ans => 2

s = 5
t = 8

12
44

12*2 = 24
*/
