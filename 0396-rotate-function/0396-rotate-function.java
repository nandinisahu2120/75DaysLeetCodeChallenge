class Solution {
    public int maxRotateFunction(int[] nums) {
        int prev=0,curr=0,sum=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            curr+=nums[i]*i;
            sum+=nums[i];
        }
        int max=curr;
        prev=curr;
        for(int i=1;i<nums.length;i++){
            curr=prev+sum-(n)*nums[n-i];
            max=Math.max(curr,max);
            prev=curr;
        }
        return max;
    }
}