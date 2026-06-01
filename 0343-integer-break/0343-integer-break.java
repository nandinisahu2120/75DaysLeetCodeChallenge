class Solution {
    final  int intmin=Integer.MIN_VALUE;
    int f(int ind,int tar,int[][] dp){
        if(tar==0) return 1;
        if(ind<=0) return intmin;
        if(dp[ind][tar]!=-1) return dp[ind][tar];
        int take=intmin;
        if(ind<=tar){
           int fac=f(ind,tar-ind,dp);
            if(fac!=intmin){
                take=ind*fac;
            }
        }
        int nottake=f(ind-1,tar,dp);
        return dp[ind][tar]=Math.max(take,nottake);
    }
    public int integerBreak(int n) {
        int[][] dp=new int[n][n+1];
        for(int[] it:dp)
        Arrays.fill(it,-1);
        return f(n-1,n,dp);
    }
}