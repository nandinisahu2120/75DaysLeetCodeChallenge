class Solution {
    int solve(int i,int j,int[][] dp,int n,List<List<Integer>>  a){
        if(i==n-1) return a.get(i).get(j);
        if(dp[i][j]!=Integer.MAX_VALUE ) return dp[i][j];
        int d=a.get(i).get(j)+solve(i+1,j,dp,n,a);
        int dg=a.get(i).get(j)+solve(i+1,j+1,dp,n,a);
        return dp[i][j]=Math.min(d,dg);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
       // int m=triangle[0].length;

        int[][] dp=new int[n][n];
        // for(int i=0;i<n;i++){
        //     Arrays.fill(dp[i],Integer.MAX_VALUE);
        // }
        for(int i=0;i<n;i++){
            dp[n-1][i]=triangle.get(n-1).get(i);
        }
        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                  int d=triangle.get(i).get(j)+dp[i+1][j];
                  int dg=triangle.get(i).get(j)+dp[i+1][j+1];
                  dp[i][j]=Math.min(d,dg);
            }
        }
        return dp[0][0];
    }
}