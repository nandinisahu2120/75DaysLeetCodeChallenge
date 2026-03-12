class Solution {
    int solve(int i,int j,int[][] arr,int[][] dp){
        if(i==0 && j==0) return arr[0][0];
        if(i<0 || j<0) return Integer.MAX_VALUE;
        if(dp[i][j]!=-1) return dp[i][j];
        int up=solve(i-1,j,arr,dp);
        int left=solve(i,j-1,arr,dp);
        int ans=Math.min(up,left);
        if(ans==Integer.MAX_VALUE) dp[i][j]=Integer.MAX_VALUE;
        return dp[i][j]=ans+arr[i][j];

    }
    public int minPathSum(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        int[][] dp=new int[n][m];
        //  for(int i=0;i<grid.length;i++)
        //     Arrays.fill(dp[i],-1);
        dp[0][0]=grid[0][0];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 && j==0) dp[i][j]=grid[0][0];
                else{
                     int up=Integer.MAX_VALUE,left=Integer.MAX_VALUE;
                        if(i>0)up=dp[i-1][j];
                        if(j>0)left=dp[i][j-1];
                        int ans=Math.min(up,left);
                        if(ans==Integer.MAX_VALUE) dp[i][j]=Integer.MAX_VALUE;
                         dp[i][j]=ans+grid[i][j];
                       // curr[j]=(up+left)%mod;
                }
            }
        }
        return dp[n-1][m-1];
        
    }
}