class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] ind=new int[257];//leaving the zero index
        Arrays.fill(ind,-1);
        int l=0,r=0,maxlen=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            if(ind[ch]!=-1)
            {
                if(ind[ch]>=l)
                l=ind[ch]+1;}
            maxlen=Math.max(maxlen,r-l+1);
            ind[ch]=r;
            r++;
        }
    return maxlen;
    }
}