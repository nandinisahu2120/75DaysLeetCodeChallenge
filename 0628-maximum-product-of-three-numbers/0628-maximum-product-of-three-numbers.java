class Solution {
    public int maximumProduct(int[] nums) {
        int l=nums.length-1;
        Arrays.sort(nums);
        int p=nums[l]*nums[l-1]*nums[l-2];
        System.out.println("1 :"+p);
        if((l+1)>=4)
        {
            System.out.println("hhffg");
            if(nums[0]<0&&nums[1]<0){
            if(nums[0]*nums[1]*nums[l]>p)
                p=nums[0]*nums[1]*nums[l];
               System.out.println("2 :"+p); 
        }
        if(nums[0]<0&&nums[2]<0){
            if(nums[0]*nums[2]*nums[l]>p)
                p=nums[0]*nums[2]*nums[l];
            System.out.println("3 :"+p);
        }
        if(nums[2]<0&&nums[1]<0){
            if(nums[2]*nums[1]*nums[l]>p)
                p=nums[2]*nums[1]*nums[l];
            System.out.println("4 :"+p);
        }
        }
        System.out.println("5 :"+p);
        return p;
    }
}