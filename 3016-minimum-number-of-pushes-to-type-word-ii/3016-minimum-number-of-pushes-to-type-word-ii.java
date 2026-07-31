class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for(int i = 0 ; i < word.length() ; i++){
           freq[word.charAt(i) - 'a'] ++;
        }
        int ans = 0, fac = 1, cnt = 0;
        Arrays.sort(freq);
        for(int i = 25 ; i >=0 ; i--){
            if(freq[i] == 0) break;
                ans = ans + freq[i] * ((cnt / 8) + 1);
                cnt++; 
        }
        return ans;
    }
}