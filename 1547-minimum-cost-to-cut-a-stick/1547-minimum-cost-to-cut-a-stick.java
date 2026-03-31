class Solution {
    int solve(int i, int j,List<Integer> cuts,int[][] dp){
        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int mini=Integer.MAX_VALUE;
        for(int k=i;k<=j;k++){
            int cost=cuts.get(j+1)-cuts.get(i-1)+solve(i,k-1,cuts,dp)+solve(k+1,j,cuts,dp);
            mini=Math.min(cost,mini);
        }
        return dp[i][j]=mini;
    }
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        int c=cuts.length;
        List<Integer> li=Arrays.stream(cuts).boxed().collect(Collectors.toList());
        li.add(0,0);
        li.add(c+1,n);
        int[][] dp=new int[c+2][c+2];
        // for(int[] a: dp){
        //     Arrays.fill(a,-1);
        // }
        for(int j=1;j<c;j++){
            for(int i=j+1;i<c;i++){
                dp[i][j]=0;
            }
        }
        for(int i=c;i>=1;i--){
            for(int j=i;j<=c;j++){
                int mini=Integer.MAX_VALUE;
                for(int k=i;k<=j;k++){
                    int cost=li.get(j+1)-li.get(i-1)+dp[i][k-1]+dp[k+1][j];
                    mini=Math.min(cost,mini);
                }
                dp[i][j]=mini;
            }
        }
        return dp[1][c];

    }
}