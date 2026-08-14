class Solution {
    public int maximumLengthSubstring(String s) {
        int[] hash = new int[26];
        int l = 0 , r = 0, max = 0;
        for( ; r < s.length(); r++){
            int chr = s.charAt(r) - 'a';
            hash[chr]++;
            while(hash[chr] >2){
                int chl = s.charAt(l) - 'a';
                hash[chl]--;
                l++;
            }
            max = Math.max(max, r - l +1);
        }
        return max;
    }
}