
// class Solution {
//     public int characterReplacement(String s, int k) {
//        int[] hash=new int[26];
//       int l=0,r=0,maxf=0,maxlen=0,n=s.length();
//        while(r<n){
//         char ch=s.charAt(r);
//         hash[ch-'A']++;
//         maxf=Math.max(maxf,hash[ch-'A']);
//         while((r-l+1-maxf)>k){
//             hash[s.charAt(l)-'A']--;
//             l++;
//             maxf=0;
//             for(int i=0;i<26;i++){
//                maxf=Math.max(maxf,hash[i]);
//             }
//         }
//         if((r-l+1-maxf)<=k)
//         maxlen=Math.max(maxlen,r-l+1);
//         r++;
//        } 
//        return maxlen;
//     }
// }
//TC=O(2N*26)
//sc=O(26)
class Solution {
    public int characterReplacement(String s, int k) {
       int[] hash=new int[26];
      int l=0,r=0,maxf=0,maxlen=0,n=s.length();
       while(r<n){
        char ch=s.charAt(r);
        hash[ch-'A']++;
        maxf=Math.max(maxf,hash[ch-'A']);
        // while((r-l+1-maxf)>k){
        if((r-l+1-maxf)>k){
            hash[s.charAt(l)-'A']--;
            l++;
            maxf=0;
            // for(int i=0;i<26;i++){
            //    maxf=Math.max(maxf,hash[i]);
            // }
        }
        if((r-l+1-maxf)<=k)
        maxlen=Math.max(maxlen,r-l+1);
        r++;
       } 
       return maxlen;
    }
}
