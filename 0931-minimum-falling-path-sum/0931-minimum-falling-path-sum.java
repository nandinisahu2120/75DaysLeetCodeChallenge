//class Solution {
    // int solve(int i,int j,int[][] a){
    //     if(i==0) return a[0][j];
    //     if(j>=m ||j<0|| i<0) return 0;
    //     int leftup= a[i][j] +solve(i-1,j-1,a);
    //     int rightup=a[i][j] +solve(i-1,j+1,a);
    //     int up=a[i][j] +solve(i-1,j,a);
    //     return (Math.min(leftup,Math.min(rightup,up)));
    // }
//     int solve(int i,int j,int[][] a,int[][] dp,int m){
//         if(j>=m ||j<0|| i<0) return Integer.MAX_VALUE;
//         if(i==0) return a[0][j];
//         if(dp[i][j]!=Integer.MAX_VALUE ) return dp[i][j];
//         int leftup= solve(i-1,j-1,a,dp,m);
//         int rightup=solve(i-1,j+1,a,dp,m);
//         int up=solve(i-1,j,a,dp,m);
//         int ans=((Math.min(leftup,Math.min(rightup,up))));
//         if(ans==Integer.MAX_VALUE) return dp[i][j]=ans;
//         return dp[i][j]=ans+a[i][j];
//     }
//     public int minFallingPathSum(int[][] matrix) {
//         int n=matrix.length;
//         int[][] dp=new int[n][n];
//          for(int i=0;i<n;i++){
//             Arrays.fill(dp[i],Integer.MAX_VALUE);
//         }
//         int min=Integer.MAX_VALUE;
//         for(int i=0;i<n;i++)
//             min=Math.min(min,solve(n-1,n-i-1,matrix,dp,n));
//             return min;
//     }
// }
class Solution {

    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int[] p=new int[n];
        for(int i=0;i<n;i++){
            p[i]=matrix[0][i];
        }
        for(int i=1;i<n;i++){
        int[] c=new int[n];
            for(int j=0;j<n;j++){
                int leftup=Integer.MAX_VALUE,rightup=Integer.MAX_VALUE,up;
                 if(j>0)leftup= p[j-1];
                 if(j<=n-2)rightup=p[j+1];
                 up=p[j];
                //  ans=((Math.min(leftup,Math.min(rightup,up))));
                // if(ans==Integer.MAX_VALUE) return dp[i][j]=ans;
                 c[j]=(Math.min(leftup,Math.min(rightup,up)))+matrix[i][j];

            }
            p=c;
        }
         int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
            min=Math.min(min,p[i]);
            return min;
    }
}