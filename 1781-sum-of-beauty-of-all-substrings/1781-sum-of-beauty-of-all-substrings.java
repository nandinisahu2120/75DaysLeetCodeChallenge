class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int cnt = 0;
        for(int i = 0 ; i < n; i++ ){
            int[] freq = new int[26];
            for(int j = i ; j < n ; j++){
                int min = (int)1e8;
                int max = 0;
                freq[s.charAt(j) - 'a']++;
                for(int k = i ; k <= j ; k++){
                    min = Math.min(min, freq[s.charAt(k) - 'a']);
                    max = Math.max(max, freq[s.charAt(k) - 'a']);
                    // System.out.println(" min =" + min + " max = " + max + " i =" + i + " j = "+ j + " cnt = " + cnt);
                }
                cnt += max - min;
            }
        }
        return cnt;
    }
}