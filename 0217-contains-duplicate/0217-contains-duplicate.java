class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i:nums)
        {
            mpp.put(i,mpp.getOrDefault(i,0)+1);
        }
        boolean res=false;
        for(int i:mpp.keySet())
        {
          //  int t=mpp.getOrDefault((nums[i]),0);
          int t=mpp.get(i);
            if (t>=2)
            {
                res=true;
                break;
            }
        }
        return res;
    }
}