class Solution {
    boolean valid(long mid,int[] time, int totalTrips){
        long cnt=0;
        for(int it:time){
            cnt+=mid/(long)it;
            if(cnt>=totalTrips) return true;
        }
        return false;
    }
    public long minimumTime(int[] time, int totalTrips) {
        long max=Integer.MIN_VALUE;
        for(int it:time){
            max=Math.max(max,it);
        }
        long low=1,high=max*totalTrips;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(valid(mid,time,totalTrips)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}