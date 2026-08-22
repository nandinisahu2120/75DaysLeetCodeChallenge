class Solution {
    boolean check (String st){
        int s = 0, e = st.length() - 1;
        while(s < e){
            if(st.charAt(s) != st.charAt(e)) return false;
            s++;
            e--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String ans = "";
        int n = s.length();
        for(int i = 0 ; i < n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = i ; j < n ;j++){
                sb.append(s.charAt(j));
                if(check(sb.toString())){
                    if(sb.length() > ans.length()) ans = sb.toString();
                }
            }
        }
        return ans;
    }
}