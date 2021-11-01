class Solution {
public:
    void dfs(vector<vector<char>>& board,int i,int j)
    {
        if(board[i][j] == 'O')
        {
            board[i][j] = '1';
             if(i+1 < board.size()) dfs(board, i+1, j);
        if(i > 1) dfs(board, i-1, j);
        if(j+1 < board[i].size()) dfs(board, i, j+1);
        if(j > 1) dfs(board, i, j-1);
            // if(i>1 )//&& board[i-1][j]=='O')
            //     dfs(i-1,j,board);
            // if(j>1)// && board[i][j-1]=='O')
            //     dfs(i,j-1,board);
            // if(i<board.size()-1)// && board[i+1][j] == 'O')
            //     dfs(i+1,j,board);
            // if(j<board.size()-1)// && board[i][j+1]=='O')
            //     dfs(i,j+1,board);
        }
    }
    void solve(vector<vector<char>>& board) {
        if(board.size()<=0)
            return ;
        int row = board.size();
        int column = board[0].size();
        // cout<<"Size of row: "<<row<<endl;
        // cout<<"Size of col: "<<column<<endl;
        //First row and Last row
        for(int i = 0;i<row;i++)
        {
            // cout<<"0"<<" "<<i<<endl;
            dfs(board,i,0);
            // cout<<"Here"<<column-1<<" "<<i<<endl;
            dfs(board,i,column-1);
        }
        
        //First column and last column
        for(int i = 1;i<column-1;i++)
        {
            // cout<<"In column"<<endl;
            // cout<<i<<" "<<"0"<<endl;
            dfs(board,0,i);
            // cout<<i<<" "<<column-1<<endl;
            dfs(board,row-1,i);
        }
        
        //Make all the O's to X's
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<column;j++)
            {
                // cout<<board[i][j];
                if(board[i][j]=='O')
                board[i][j] = 'X';
                else if(board[i][j]== '1')
                board[i][j] = 'O';
            }
        }
    }
};
