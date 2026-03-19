class Solution {
    public boolean isPalindrome(String s) {
        // String str="";
        s=s.toLowerCase();
        int f=0,l=s.length()-1;
        while(f<l)
        {
            char start=s.charAt(f);
            char last=s.charAt(l);
            if(!Character.isLetterOrDigit(start)) {
                f++;
                continue;
            }
            if(!Character.isLetterOrDigit(last)) {
                l--;
                continue;
            }
            if(start!=last) return false;
            f++;
            l--;
        }
        // for(int i=0;i<s.length();i++)
        // {
        //     char start=s.charAt(i);
        //     char last=s.charAt(s.length()-i-1);
        //     if(Character.isLetterOrDigit(ch))
        //     str+=ch;
        // }
        // System.out.println(str);
        // return checkpallindrome(0,str);
        return true;
            
    }
    // public boolean checkpallindrome(int i,String s)
    // {
    //     if(i>=s.length()/2)
    //     return true;
    //     if(s.charAt(i)!=s.charAt(s.length()-i-1))
    //     return false;
    //     return (checkpallindrome(i+1,s));
    // }
}