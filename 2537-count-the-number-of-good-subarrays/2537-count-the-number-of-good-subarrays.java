class Solution {
    public long countGood(int[] nums, int k) {
        int l=0,r=0;
        HashMap<Integer,Integer> hp=new HashMap<>();
        long cnt=0,pair=0;
        while(r<nums.length){
            pair+=hp.getOrDefault(nums[r],0);
                // System.out.println(pair+"       ijjljnbkhgbjhkjb");
            hp.put(nums[r],hp.getOrDefault(nums[r],0)+1);
            while(pair>=k){
                cnt+=nums.length-r;
                hp.put(nums[l],hp.get(nums[l])-1);
                if(hp.get(nums[l])==0) hp.remove(nums[l]);
                pair-=hp.getOrDefault(nums[l],0);
                l++;
            }
            r++;
        }
        return cnt;
    }
}