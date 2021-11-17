/* 
m = 3 n = 7
1) Matrix in beginning:
[Person,0 ,0 ,0 ,0 ,0 ,0]
[0, 0, 0 , 0, 0 , 0 , 0 ]
[0,0,0,0,0,0,destination]
-> Now when person is at 0,0 Then to go to 0,1 or 0,2 or 0,3or 0,4 or 0,5 or 0,6 or 0,7 there is only One way Since person can either 
move to right or down.
2) Matrix after filling position for 1st row and 1 column
[Person,1 ,1 ,1 ,1 ,1 ,1]
[1, 0(1,1), 0 , 0, 0 , 0 , 0 ]
[1,0,0,0,0,0,destination]
-> Now  for person to reach at 1,1 either he/she can come from (1,0)(i.e left) or from (0,1)(i.e up)
-> Since from 2 places person can reach at 1,1 so 
-> number of ways to reach at mat[i][j] = mat[i][j-1] + mat[i-1][j]

*/
class Solution {
public:
    int uniquePaths(int m, int n) {
        int mat[m][n];
        for(int i=0;i<m;i++)
        {
            mat[i][0] = 1;
        }
        for(int i=0;i<n;i++)
        {
            mat[0][i] = 1;
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                mat[i][j] = mat[i-1][j]+mat[i][j-1];
            }
        }
        return mat[m-1][n-1];
    }
};
