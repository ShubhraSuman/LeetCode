class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
         Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
         int maxUnits = 0;
         
         for( int i = 0;i< boxTypes.length; i++)
         {
             if((boxTypes[i][0])<truckSize)
             {
                 maxUnits += (boxTypes[i][0] * boxTypes[i][1]);
                 // System.out.println("1 " + maxUnits);
             }
             else if(truckSize > 0)
             {
                 maxUnits+= (truckSize*boxTypes[i][1]);
                 // System.out.println("2 " + maxUnits);
             }
             // if(truckSize > boxTypes[i][0])
             truckSize -= boxTypes[i][0];
         }
        return maxUnits;
    }
}
/*
5,10
3,9
4,7
2,5
trucksize = 10 -5 = 5 - 3 = 2
units = 5*10 + 3*9 + 2*7 = 77++14 = 91
*/
