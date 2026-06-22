class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> hp = new HashMap<>();
        int max = -1;
        for(int num : nums){
            hp.put(num, hp.getOrDefault(num, 0) + 1);
            max = Math.max(max, hp.get(num));
        }
        HashMap<Integer, Integer> hp2 = new HashMap<>();
        int l = 0, r = 0,min = Integer.MAX_VALUE;
        while(r < nums.length){
            hp2.put(nums[r], hp2.getOrDefault(nums[r], 0) + 1);
            while(hp2.get(nums[r]) == max){
                min =Math.min(min, r - l + 1);
                hp2.put(nums[l], hp2.getOrDefault(nums[l], 0) - 1);
                l++;
                
            }
            r++;

        }
        return min;
    }
}