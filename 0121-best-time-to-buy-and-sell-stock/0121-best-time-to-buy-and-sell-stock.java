class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int purchase=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<purchase)
                purchase=prices[i];
            else if(prices[i]-purchase>profit)
                profit=(prices[i]-purchase);
        }
        return profit;
    }
}