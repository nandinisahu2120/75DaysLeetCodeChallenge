class Solution {
    boolean valid(String s1,String s2){
        if(s1.length()!=s2.length()+1) return false;
        int i=0,j=0;
        while(i<s1.length()){
            if((j<s2.length()) && s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            } 
            else i++;
        }
        if(i==s1.length() && j==s2.length()) return true;
        else return false;
    }
    public int longestStrChain(String[] words) {
        int[] dp=new int[words.length];
        int maxi=1;
        Arrays.fill(dp,1);
        Arrays.sort(words,(a,b)->a.length()-b.length());
        for(int i=0;i<words.length;i++){
            for(int prev=0;prev<i;prev++){
                if(valid(words[i],words[prev]) && dp[prev]+1>dp[i]) {
                    dp[i]=dp[prev]+1;
                }

                //System.out.println(words[i]);
            }
            maxi=Math.max(maxi,dp[i]);
        }
        return maxi;
    }
}