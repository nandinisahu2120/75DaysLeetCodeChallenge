class Solution {
    boolean valid(int i,int ind,String s){
        int st=i,e=ind;
        while(st<e){
            if(s.charAt(st)!=s.charAt(e)) return false;
            st++;e--;
        }
        return true;
    }
    int solve(int i,String s,int[] dp){
        int n=s.length();
        if(i==n) return 0;
        if(dp[i]!=-1) return dp[i];
        int min=Integer.MAX_VALUE;
        // StringBuilder sb=new StringBuilder();
        for(int ind=i;ind<n;ind++){
            //sb.append(s.charAt(ind));
            if(valid(i,ind,s)){
            int cnt=1+solve(ind+1,s,dp);
            min=Math.min(min,cnt);}
            // sb.deleteCharAt(sb.length()-1);
        }
        return dp[i]=min;
    }
    public int minCut(String s) {
        int[] dp=new int[s.length()];
        Arrays.fill(dp,-1);
        return solve(0,s,dp)-1;
    }
}