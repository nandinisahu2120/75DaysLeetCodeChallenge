class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int min=nums[0];
       // System.out.println("max="+max);
       //  System.out.println("min="+min);
        HashSet<Integer> hs=new HashSet<>();
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        hs.add(nums[i]);
         //System.out.println(hs);

        for(int i=min;i<=max;i++)
        {
            if(!hs.contains(i))
            li.add(i);

        }
        return li;
    }
}