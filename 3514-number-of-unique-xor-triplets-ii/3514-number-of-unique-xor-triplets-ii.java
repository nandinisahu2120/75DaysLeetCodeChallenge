class Solution {
    public int uniqueXorTriplets(int[] nums) {
        // HashSet<Integer> st1 = new HashSet<>();
        int max = -1;
        for(int it :nums){
            max = Math.max(max, it);
        }
        int u = 1;
        while( u <= max) u <<= 1;
        boolean[] ar1 = new boolean[u];
        int n = nums.length;
        for(int i = 0 ; i < n; i++){
            for(int j = i ; j < n ;j++){
                ar1[nums[i] ^ nums[j]] = true;
            }
        }
        // System.out.println(st1);
        boolean[] ar2 = new boolean[2048];
        // HashSet<Integer> st2 /= new HashSet<>();
        for(int i = 0 ;i < u ; i++){
            if(!ar1[i]) continue;
            for(int j = 0 ; j < n ; j++){
                ar2[i ^ nums[j]] = true;
            }
        }
        int cnt = 0; 
        for(boolean it : ar2) if(it)cnt++;
        // System.out.println(st2);

        // return st2.size();
        return cnt;
    }
}