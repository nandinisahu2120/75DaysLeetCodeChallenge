class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> li=new ArrayList<>();
        if(nums.length==0) return li;
        StringBuilder sb=new StringBuilder();
        int  a=nums[0];
        int b=nums[0];
        int k=0;
        sb.append(nums[0]);
        for(int i=1;i<nums.length;i++){
            b=nums[i];
            if(b==nums[i-1]+1 ){
                continue;                
            }
            else{
                if(i-k>1)
                    sb.append("->").append(nums[i-1]);
                li.add(sb.toString());
                sb.setLength(0);
                a=nums[i];
                k=i;
                sb.append(a);
            }
        }
        if(k==nums.length-1)
            {
                li.add(sb.toString());
            }
            else{
                sb.append("->").append(nums[nums.length-1]);
                li.add(sb.toString());
                
            }
            return li;
    }
}