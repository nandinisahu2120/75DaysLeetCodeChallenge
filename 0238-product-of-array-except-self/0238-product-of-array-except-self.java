class Solution {
    
    public int[] productExceptSelf(int[] nums) {
        int[] prefixprod=new int[nums.length];
        int[] suffixprod=new int[nums.length];
        prefixprod[0]=1;
        suffixprod[nums.length-1]=1;
    for(int i=1;i<nums.length;i++){
        prefixprod[i]=prefixprod[i-1]*nums[i-1];
    }
    for(int i=nums.length-2;i>=0;i--){
        suffixprod[i]=suffixprod[i+1]*nums[i+1];
    }
        int[] pro=new int[nums.length];
        for(int i=0;i<nums.length;i++){
           pro[i]=suffixprod[i]*prefixprod[i];
        }
        return pro;
    }
}