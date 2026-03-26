class Solution {
    int solve(int ind,int buy,int[] prices,int[][] dp){
        if(ind==prices.length) return 0;
        if(dp[ind][buy]!=-1) return dp[ind][buy];
      int profit=0;
        if(buy==1){
            profit=Math.max(-prices[ind]+solve(ind+1,0,prices,dp),solve(ind+1,1,prices,dp));
        }
        else profit=Math.max(prices[ind]+solve(ind+1,1,prices,dp),solve(ind+1,0,prices,dp));
        return dp[ind][buy]=profit;
    }
    public int maxProfit(int[] prices) {
        int[][] dp=new int[prices.length][2];
        for(int i=0;i<prices.length;i++){
            Arrays.fill(dp[i],-1);
        };
        
        return (solve(0,1,prices,dp));
    }
}