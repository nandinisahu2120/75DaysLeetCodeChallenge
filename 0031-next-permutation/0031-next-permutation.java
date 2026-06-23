class Solution {
    public void nextPermutation(int[] nums) {
        int ind = -1;
        int  n = nums.length;

        for(int i = n - 1 ;i>0 ;i--){
            if(nums[i - 1] < nums[i]){
                ind = i - 1;
                System.out.println(ind);
                break;
            }
        }
        if(ind == -1 ) {
            reverse(nums ,0, n-1 );
        }
        else{

            for(int i = n - 1; i>  0;i--){
                if(nums[i]> nums[ind]){
                    int t = nums[i];
                    nums[i]= nums [ind];
                    nums[ind] = t;
                    break;
                }
            }
            reverse(nums, ind+1, n - 1);
        }

    }
    void reverse(int[] a, int start, int end){
        while(start < end){
            int t =a[start];
            a[start] = a[end];
            a[end] = t;
            start++;
            end--;
        }
    }
}