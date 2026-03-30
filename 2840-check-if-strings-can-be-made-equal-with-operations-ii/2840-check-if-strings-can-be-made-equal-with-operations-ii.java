class Solution {
    public boolean checkStrings(String s1, String s2) {
        int n=s1.length();
        int[] hash1e=new int[26];
        int[] hash1o=new int[26];
        for(int i=0;i<n;i++){
            char ch=s1.charAt(i);
            if(i%2==0){
                hash1e[ch-'a']++;

            }
            else
                hash1o[ch-'a']++;

        }
        int[] hash2e=new int[26];
        int[] hash2o=new int[26];
        for(int i=0;i<n;i++){
            char ch=s2.charAt(i);
            if(i%2==0){
                hash2e[ch-'a']++;
            }
            else
                hash2o[ch-'a']++;

        }
        for(int i=0;i<26;i++){
            if(hash1e[i]!=hash2e[i]) return false;
            if(hash1o[i]!=hash2o[i]) return false;
        }
        return true;

    }
}