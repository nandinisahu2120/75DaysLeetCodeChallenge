// class Solution {
//     int min;
//     void solve(int i,int j,int[][] grid,int xor){
//         int n=grid.length;
//         int m=grid[0].length;
//         if(j>=m) return ;
//         if(i>=n) return ;
//         if(i==n-1 && j==m-1) {
//             min=Math.min(min,xor^grid[i][j]);
//             return;
//         }
//         solve(i,j+1,grid,xor^grid[i][j]);
//         solve(i+1,j,grid,xor^grid[i][j]);
//         // return Math.min(right,down);
        
//     }
//     public int minCost(int[][] grid) {
//         min=Integer.MAX_VALUE;
//         solve(0,0,grid,0);
//         return min;
        
//     }
// }
class Solution {
    // int min;
    int solve(int i,int j,int xor,int[][] grid,int[][][] dp){
        int n=grid.length;
        int m=grid[0].length;
        if(j>=m) return Integer.MAX_VALUE;
        if(i>=n) return Integer.MAX_VALUE;
        xor^=grid[i][j];
        if(dp[i][j][xor]!=-1)return dp[i][j][xor];
        if(i==n-1 && j==m-1) {
            return xor;
            // return min;
        }
        int right=solve(i,j+1,xor,grid,dp);
        int down=solve(i+1,j,xor,grid,dp);
        return dp[i][j][xor]=Math.min(right,down);
        
    }
    public int minCost(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        // min=Integer.MAX_VALUE;
        int[][][] dp=new int[n][m][1024];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            Arrays.fill(dp[i][j],-1);
        }
        return solve(0,0,0,grid,dp);
        // return min;
        
    }
}