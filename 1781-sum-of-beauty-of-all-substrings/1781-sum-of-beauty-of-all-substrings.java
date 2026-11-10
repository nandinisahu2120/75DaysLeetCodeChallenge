class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int cnt = 0;
        for(int i = 0 ; i < n; i++ ){
            int max = 0;
            int[] freq = new int[26];
            for(int j = i ; j < n ; j++){
                int min = (int)1e8;
                freq[s.charAt(j) - 'a']++;
                max = Math.max(max, freq[s.charAt(j) - 'a']);
                for(int it : freq){
                    if(it != 0)
                        min = Math.min(min, it);
                    // System.out.println(" min =" + min + " max = " + max + " i =" + i + " j = "+ j + " cnt = " + cnt);
                }
                cnt += max - min;
            }
        }
        return cnt;
    }
}