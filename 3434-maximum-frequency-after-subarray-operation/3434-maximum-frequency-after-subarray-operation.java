class Solution {
    public int maxFrequency(int[] nums, int k) {
        int  freqk=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k) freqk++;
        }
        int maxgain=0;
        for(int i=1;i<=50;i++){
            if(i==k) continue;
           int gain=0;
            for(int j=0;j<nums.length;j++){
                int val=(nums[j]==i)?1:(nums[j]==k)?-1:0;
                gain=Math.max(val,gain+val);
            maxgain=Math.max(gain,maxgain);

            }
        }
        return maxgain+freqk;
    }
}