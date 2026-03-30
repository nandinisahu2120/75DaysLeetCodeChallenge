class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n=nums.length;
         int[] dp1=new int[n];
         int[] cnt=new int[n];
         int maxi=1;
        Arrays.fill(dp1,1);
        Arrays.fill(cnt,1);
        for(int i=0;i<n;i++){
            for(int prev=0;prev<i;prev++){
                if(nums[prev]<nums[i] && dp1[prev]+1>dp1[i]){
                    dp1[i]=dp1[prev]+1;
                    cnt[i]=cnt[prev];
                } 
                else if(nums[prev]<nums[i] && dp1[prev]+1==dp1[i]){
                    cnt[i]+=cnt[prev];
                } 

            }
            maxi=Math.max(maxi,dp1[i]);

        }
        int nos=0;
        for(int i=0;i<n;i++){
            if(dp1[i]==maxi) nos+=cnt[i];
        }
        return nos;
    }
}