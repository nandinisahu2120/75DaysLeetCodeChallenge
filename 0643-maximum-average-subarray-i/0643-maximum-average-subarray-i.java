class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg=0, sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int l=0,r=k;
        double max=sum;
        while(r<nums.length){
            sum+=nums[r];
            sum-=nums[l];
            max=Math.max(max,sum);
            r++;
            l++;

        }
        return max/k;
    }
}