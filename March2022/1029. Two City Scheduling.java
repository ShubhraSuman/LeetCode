class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(a,b)->{
            return (a[0] - a[1]) - (b[0] - b[1]);
        });
        int totCost = 0;
        for(int i = 0;i<costs.length;i++){
            if(i<costs.length/2)
            {
                totCost += costs[i][0];
            }
            else
            {
                totCost += costs[i][1];
            }
        }
        return totCost;
    }
}

/*
[259,770](A),[448,54](B),[926,667],[184,139],[840,118](A),[577,469]]
A - B = 511 , 394,259,45,722,108
After sorting:
[184,139],[577,469],[926,667],[448,54],[259,770],[840,118]
A - 259,577,184
B - 118,54,667
*/
