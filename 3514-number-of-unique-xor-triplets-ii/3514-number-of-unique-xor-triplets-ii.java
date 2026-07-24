class Solution {
    public int uniqueXorTriplets(int[] nums) {
        HashSet<Integer> st1 = new HashSet<>();
        int n = nums.length;
        for(int i = 0 ; i < n; i++){
            for(int j = i ; j < n ;j++){
                st1.add(nums[i] ^ nums[j]);
            }
        }
        // System.out.println(st1);
        HashSet<Integer> st2 = new HashSet<>();
        for(int it : st1){
            for(int i = 0 ; i < n ; i++){
                st2.add(it ^ nums[i]);
            }
        }
        // System.out.println(st2);

        return st2.size();
    }
}