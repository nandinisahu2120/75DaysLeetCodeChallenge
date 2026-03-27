class Solution {
    int solve(int ind,int buy,int last,int[] prices,int[][][] dp){
        int n=prices.length;
        if(ind==n) return 0;
        if(dp[ind][buy][last]!=-1) return dp[ind][buy][last];
        int profit=0;
        if(buy==1){
            if(last!=1)
            profit=Math.max(-prices[ind]+solve(ind+1,0,0,prices,dp),0+solve(ind+1,1,0,prices,dp));
            else
            profit=solve(ind+1,1,0,prices,dp);
        }
        else{
            profit=Math.max(prices[ind]+solve(ind+1,1,1,prices,dp),0+solve(ind+1,0,0,prices,dp));
        }
        return dp[ind][buy][last]= profit;
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] ahead=new int[2][2];
        for(int buy=0;buy<=1;buy++){
            for(int last=0;last<=1;last++){
                ahead[buy][last]=0;
            }
        }
        for(int ind=n-1;ind>=0;ind--){
            int[][] curr=new int[2][2];
            for(int buy=0;buy<=1;buy++){
                for(int last=0;last<=1;last++){
                    int profit=0;
                    if(buy==1){
                        if(last!=1)
                        profit=Math.max(-prices[ind]+ahead[0][0],0+ahead[1][0]);
                        else
                        profit=ahead[1][0];
                    }
                    else{
                        profit=Math.max(prices[ind]+ahead[1][1],0+ahead[0][0]);
                    }
                     curr[buy][last]= profit;
                }
            }
            ahead=curr;
        }
        // for(int ind=0;ind<n;ind++){
        //     for(int buy=0;buy<=1;buy++){
        //         Arrays.fill(dp[ind][buy],-1);
        //     }
        // }
        return ahead[1][0];
            }
}