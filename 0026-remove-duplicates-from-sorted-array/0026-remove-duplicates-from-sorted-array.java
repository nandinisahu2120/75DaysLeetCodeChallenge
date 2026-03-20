class Solution {
    public int removeDuplicates(int[] nums) {
        // HashSet<Integer> st=new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     st.add(nums[i]);
        // }
        // return st.size();
            int l=1,r=1,k=1;
        if(nums.length==1) return 1;
        else{
           while(r<nums.length){
                if(nums[r]!=nums[r-1]){
                    nums[l]=nums[r];
                    l++;r++;k++;
                }
                else{
                    r++;
                }
           }
        }
        return k;
    }
}