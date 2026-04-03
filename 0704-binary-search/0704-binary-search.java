class Solution {
    public int search(int[] nums, int target) {
        int s=0,e=nums.length-1,mid,ans=-1;
        while(s<=e){
            mid=s+(e-s)/2;
            if(target>nums[mid])
                s=mid+1;
            else if(target<nums[mid])
                e=mid-1;
            else{
                ans=mid;
                break;
            }
        }
        return ans;
    }
}