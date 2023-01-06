class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int maxIceCream = 0;
        Arrays.sort(costs);
        for(int i = 0;i<costs.length;i++)
        {
            if(costs[i]<=coins)
            {
                maxIceCream++;
                coins -= costs[i];
            }
        }
        return maxIceCream;
    }
}