class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0;
        int i = 0, j = tokens.length-1;
        while(i<=j)
        {
            if(power >= tokens[i])
            {
                power = power - tokens[i];
                score++;
                i++;
            }
            else {
                   // Here 2nd condition specifies that if the element is last element then no need of gaining power and decreasing score.
                    if(score > 0 && i!=j)
                    {
                        power += tokens[j];
                        score--;
                    }
                    j--;
            }
            // System.out.println(score);
            // System.out.println(power);
        }
        return score;
    }
}

/*
if(power > tokens[i])
{
   // Token face up
   power = power - tokens[i];
   score++
}
if(score >= 1)
{
   //Token face down
   power = power + token[i];
   score--;
}
return largest possible score;

ex 1: tokens = [100,200], power = 150
 1. power = 150 - 100 = 50 score = 1
 2. power = 50 + 200 score = 1-1 =0
 
 ex 2:  tokens = [100,200,300,400], power = 200
 1. fu 0th power = 100  score = 1
 2. fd power = 500 score = 0
 3. fu power =  score = 1
 4. 
*/
