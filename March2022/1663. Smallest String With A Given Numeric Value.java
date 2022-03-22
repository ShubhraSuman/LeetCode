class Solution {
    public String getSmallestString(int n, int k) {
        char arr[] = new char[n];
        int i = 0;
        while(i<n)
        {
            arr[i++] = 'a';
        }
        k = k - n;
        int j = n-1;
        while(k>0)
        {
            if(k<25)
            {
                arr[j] = (char) ('a' + k);
                k = 0;
            }
            else
            {
                arr[j] = 'z';
                k = k - 25;
            }
            j--;
        }
        return new String(arr);
    }
}

/* 1 - a
   2 - b
   3- c
   4 - d
   5- e
   6 - f
   7- g
   8 - h
   9 - i 
   10 - j
   11 - k
   12 - m
   13 - n
   14 - o
   15 - p
   16 - q
   17 - r
   18 - s
   19 - t
   20 - u
   21 - v
   22 - w
   23 - x
   24 - y
   25 - z
*/
