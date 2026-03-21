class Solution {
    public void moveZeroes(int[] nums) {
        // Queue<Integer> st=new LinkedList<>();
        // int zero=0,i;

        // for( i=0;i<nums.length;i++){
        //     if(nums[i]!=0)
        //     st.offer(nums[i]);
        //     zero++;
        // }
        //  i=0;
        // while(!st.isEmpty()){
        //     nums[i++]=st.poll();

        // }
        // while(zero>0){
        //     nums[i++]=0;
        //     zero--;
        // }
         int zero=0,i=0,k=0;
        //int[] arr=nums.clone();
        //System.out.println(Arrays.toString(arr));
        for( i=0;i<nums.length;i++){
             if(nums[i]!=0)
                nums[k++]=nums[i];
           // else zero++;

        }
        //i=i-zero;
        while(k<nums.length){
            nums[k++]=0;
            // zero--;
         }
    }
}