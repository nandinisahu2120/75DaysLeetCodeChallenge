class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> li=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int p=i+1,q=nums.length-1;
            while(p<q){
                int sum=nums[i]+nums[p]+nums[q];
                if(sum>0){
                    q--;
                }
                else if(sum<0)
                    p++;
                else
                    {
                     List<Integer> ll=new ArrayList<>();
                     ll.add(nums[i]);   
                     ll.add(nums[p]);   
                     ll.add(nums[q]);
                     li.add(ll);
                     p++;q--;
                     while(p<q && nums[p]==nums[p-1]) p++;
                     while(p<q && nums[q]==nums[q+1]) q--;
                    }
            }
        }
        return li;
    }
   
}
        
            // for(int j=i+1;j<nums.length-1;j++)
            // {
            //     for(int k=j+1;k<nums.length;k++)
            // {
            //      if(i==j||j==k||k==i)
            //      continue;
            //      else
            //      {
            //             if(nums[i]+nums[j]+nums[k]==0)
            //                 {
            //                     li.add(nums[i]);
            //                     li.add(nums[j]);
            //                     li.add(nums[k]);
                               
            //                 }
            //      }
                   
            // }
                   
            // }
        // List<List<Integer>> triplets=new ArrayList<>();
        // int l=li.size(),c=0;
        // for(int i=0;i<l/3;i++)
        // {
        //         ArrayList<Integer> temp=new ArrayList<>();
        //         temp.add(li.get(c));
        //         temp.add(li.get(c+1));
        //         temp.add(li.get(c+2));
        //         c+=3;
        //          Collections.sort(temp);
        //         triplets.add(temp);
        // }
        // Set<List<Integer>> set = new LinkedHashSet<>(triplets);

        // List<List<Integer>> uniqueList = new ArrayList<>(set);
        // return uniqueList;

         