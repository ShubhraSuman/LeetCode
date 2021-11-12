class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int buy  = 0;
        int sell = 0;
        int profit = 0;
        int i = 0;
        while(i< prices.size()-1)
        {
            //finding valley points to buy 
            // Till the times prices are decreasing 
            while(i<prices.size()-1 && prices[i+1] <= prices[i])
                i++;
            buy = prices[i];
            
            //till the time prices are increasing
            while(i<prices.size()-1&& prices[i+1] > prices[i])
                i++;
            sell = prices[i];
            profit += sell-buy;
        }
        return profit;
    }
};
