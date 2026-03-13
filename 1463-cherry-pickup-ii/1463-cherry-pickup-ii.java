class Solution {
    int exp=(-1)*(int)Math.pow(10,5);
    int solve(int i,int j1,int j2,int n,int m,int[][] a,int[][][] dp){
        if(j1<0 || j2<0 || j1>=m || j2>=m) return exp;
        if(i==n-1) {
            if(j1==j2) return a[i][j1];
            else return a[i][j1]+a[i][j2];

        }
        if(dp[i][j1][j2]!=-1) return dp[i][j1][j2];
        int maxi=Integer.MIN_VALUE;
        for(int dj1=-1;dj1<=1;dj1++){
            for(int dj2=-1;dj2<=1;dj2++){
                int value=0;
            if(j1==j2)  value=a[i][j1];
            else value=a[i][j1]+a[i][j2];
            maxi=Math.max(maxi,value+solve(i+1,j1+dj1,j2+dj2,n,m,a,dp));
            } 
        }
        return dp[i][j1][j2]=maxi;
    }
    public int cherryPickup(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] front=new int[m][m];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         Arrays.fill(dp[i][j],-1);
        //     }
        // }
        for(int j1=0;j1<m;j1++){
            for(int j2=0;j2<m;j2++){
               if(j1==j2) front[j1][j2]=grid[n-1][j1];
               else front[j1][j2]=grid[n-1][j1]+grid[n-1][j2];

            }
        }
            for(int i=n-2;i>=0;i--){
                int curr[][] =new int[m][m];
                for(int j1=0;j1<m;j1++){
                    for(int j2=0;j2<m;j2++){
                        int maxi=Integer.MIN_VALUE;
                        for(int dj1=-1;dj1<=1;dj1++){
                            for(int dj2=-1;dj2<=1;dj2++){
                                int value=0;
                                if(j1==j2)  value=grid[i][j1];
                                else value=grid[i][j1]+grid[i][j2];
                                if(dj1+j1>=0 && dj1+j1<m && dj2+j2>=0 && dj2+j2<m )
                                    value+=front[dj1+j1][dj2+j2];
                                else value=exp;
                                maxi=Math.max(maxi,value);
                            } 
                        }
                         curr[j1][j2]=maxi;

                    }

                }
                front=curr;
            }
        return front[0][m-1];
        }
        
    
}