class Solution {
    public int largestAltitude(int[] gain) {
        int ini = 0, ans = 0;
        for(int ele : gain){
            ini = ini + ele;
            ans = Math.max(ini, ans);
        }
        return ans;
    }
}