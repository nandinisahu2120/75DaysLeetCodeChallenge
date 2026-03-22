class Solution {
    boolean solve(int i,int j,String p,String s,int[][] dp){
        if(i==0 && j==0) return true;
        if(i==0 && j>0) return false;
        if(j==0 && i>0) {
            for(int k=0;k<i;k++){
                if(p.charAt(k)!='*') return false;
            }
            return true;
        }
        if(dp[i][j]!=-1) return (dp[i][j]==1)?true:false;
        if(p.charAt(i-1)==s.charAt(j-1) || p.charAt(i-1)=='?'){
            dp[i][j]= (solve(i-1,j-1,p,s,dp)?1:0);
            return (dp[i][j]==1)?true:false;
        }
        if(p.charAt(i-1)=='*') {
            dp[i][j] = (solve(i-1,j,p,s,dp)||solve(i,j-1,p,s,dp)) ?1:0 ;
            return (dp[i][j]==1)?true:false;
         }
        dp[i][j] = 0;
        return false;
    }
    public boolean isMatch(String s, String p) {
        int n=p.length();
        int m=s.length();
        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
       return  solve(n,m,p,s,dp);
    }
}