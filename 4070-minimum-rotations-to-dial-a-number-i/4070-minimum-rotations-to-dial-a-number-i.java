class Solution {
    public int minRotations(String s) {
        int cnt = 0 ;
        char c = '0';
        for(char ch : s.toCharArray()){
            char b =(c > ch )? c: ch;
            char sm =(c < ch )? c : ch;
            int val = '9' - b + sm - '0' + 1;
            cnt += Math.min(val , Math.abs(b - sm));
            c = ch;
        }
        return cnt;
    }
}