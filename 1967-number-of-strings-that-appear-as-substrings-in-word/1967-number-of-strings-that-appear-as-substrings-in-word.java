class Solution {
    public int numOfStrings(String[] patterns, String word) {
        HashSet<String> st = new HashSet<>();
        for(int i = 0 ;i < word.length();i++){
            
            for(int j= i ;j< word.length();j++){
                st.add(word.substring(i, j + 1));
            }
        }
        int cnt = 0 ; 
        for(String s : patterns){
            if(st.contains(s)) cnt++;
        }
        return cnt;
    }
}