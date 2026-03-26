class Solution {
    int solve(int ind,int buy ,int cap,int[] prices,int[][][] dp){
        int n=prices.length;
        if(ind==n) return 0;
        if(cap==0) return 0;
        if(dp[ind][buy][cap]!=-1) return dp[ind][buy][cap];
        int profit=0;
        if(buy==1){
            profit=Math.max(-prices[ind]+solve(ind+1,0,cap,prices,dp),0+solve(ind+1,1,cap,prices,dp));
        }
        else
            profit=Math.max(prices[ind]+solve(ind+1,1,cap-1,prices,dp),0+solve(ind+1,0,cap,prices,dp));
        return dp[ind][buy][cap]=profit;
    }
    public int maxProfit(int[] prices) {
        int[][] ahead=new int[2][3];
        int n=prices.length;
        // for(int i=0;i<prices.length;i++){
        //     for(int buy=0;buy<=1;buy++){
        //         Arrays.fill(dp[i][buy],-1);
        //     }
        // }
        for(int buy=0;buy<=1;buy++){
            for(int cap=0;cap<=1;cap++){
                ahead[buy][cap]=0;
            }
        }
        // for(int ind=0;ind<prices.length;ind++){
        //     for(int buy=0;buy<=1;buy++){
        //         dp[ind][buy][0]=0;
        //     }
        // }
        for(int ind=n-1;ind>=0;ind--){
            int[][] curr=new int[2][3];
            for(int buy=0;buy<=1;buy++){
                for(int cap=1;cap<=2;cap++){
                    int profit=0;
                    if(buy==1){
                        profit=Math.max(-prices[ind]+ahead[0][cap],0+ahead[1][cap]);
                    }
                    else
                        profit=Math.max(prices[ind]+ahead[1][cap-1],0+ahead[0][cap]);
                    curr[buy][cap]=profit;
                }
            }
                ahead=curr;
        }
            return ahead[1][2];

    }
}