class Solution {
    int lowerbound(List<Integer> arr,int n){
        int l=0,h=arr.size()-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr.get(mid)>=n)
            h=mid-1;
            else
            l=mid+1;

        }
        return l;
    }
    public int lengthOfLIS(int[] nums) {
        List<Integer> li=new ArrayList<>();
        int len=1;
        li.add(nums[0]);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>li.get(li.size()-1))
           { li.add(nums[i]);
             len++;
           }
            else{
                int ind=lowerbound(li,nums[i]);
                li.set(ind,nums[i]);
            }
        }
        return len;
    }
}