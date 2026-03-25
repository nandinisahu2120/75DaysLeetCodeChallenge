class Solution {
    public int maxProfit(int[] prices) {
        int purchase=prices[0],profit=0;
        for(int i=0;i<prices.length;i++){
            purchase=Math.min(purchase,prices[i]);
            profit=Math.max(profit,prices[i]-purchase);
        }
        return profit;
    }
}