class Solution {
public:
    bool isRobotBounded(string instructions) {
        int x = 0,y = 0;
        char direction = 'N';
        for(int i = 0;i<instructions.size();i++)
        {
            if(instructions[i]=='G')
            {
                if(direction=='N')
                {
                    y++;
                }
                else if(direction=='S')
                {
                    y--;
                }
                else if(direction=='E')
                {
                    x++;
                }
                else if(direction=='W')
                {
                    x--;
                }
            }
            else if(instructions[i]=='L')
            {
                 if(direction=='N')
                {
                   direction = 'W';
                }
                else if(direction=='S')
                {
                   direction = 'E';
                }
                else if(direction=='E')
                {
                    direction = 'N';
                }
                else if(direction=='W')
                {
                    direction = 'S';
                }
            }
            else if(instructions[i]=='R')
            {
                 if(direction=='N')
                {
                   direction = 'E';
                }
                else if(direction=='S')
                {
                   direction = 'W';
                }
                else if(direction=='E')
                {
                    direction = 'S';
                }
                else if(direction=='W')
                {
                    direction = 'N';
                }
            }
            
        }
       if(x==0&&y==0)
            return true;
            if(direction == 'N')
                return false;
        return true;
    }
};
