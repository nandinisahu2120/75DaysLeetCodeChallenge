// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] ar=new int[2];
//         for(int i=0;i<nums.length-1;i++)
//         {
//             for(int j=i+1;j<nums.length;j++)
//             {
//                 if(nums[i]+nums[j]==target)
//                    {
//                     ar[0]=i;
//                      ar[1]=j;
//                    } 
                   
//             }
//         }
//          return ar;
//     }
   
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> st=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            st.put((target-nums[i]),i);
        }
        int[] a=new int[2];
        a[0]=-1;
        a[1]=-1;
        for(int i=0;i<nums.length;i++){
            if(st.containsKey(nums[i]) && i!=st.get(nums[i])){
                a[0]=i;
                a[1]=st.get(nums[i]);
                return a;
            }
        }
        return a;
    }
}