class Solution {
     int dir[][]=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
     boolean endReached(int i,int j,int mid,int n,int m,int[][]heights,int[][] visited)
    {
       if(i==n-1 && j==m-1)
           return true;
         for(int d[]:dir){
            int x=i+d[0];
            int y=j+d[1];
            if(x<0 || y<0 || x>=n || y>= m || visited[x][y]==1)
                continue;
          
            if(Math.abs(heights[x][y]-heights[i][j])<=mid) {
                  visited[x][y]=1;
                if(endReached(x,y,mid,n,m,heights,visited)) return true;
            }
        }
        return false;
    }
    public int minimumEffortPath(int[][] heights) {
        int st = 0;
        int end = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        int m = heights.length;
        int n = heights[0].length;
        while(st<=end)
        {
            int mid = (st + end)/2;
            int visited[][] = new int[100][100];
            visited[0][0] = 1;
            if(endReached(0,0,mid,m,n,heights,visited))
            {
                ans = Math.min(ans,mid);
                end = mid-1;
            }
            else
            {
                st = mid+1;
            }
        }
        return ans;
    }
}
