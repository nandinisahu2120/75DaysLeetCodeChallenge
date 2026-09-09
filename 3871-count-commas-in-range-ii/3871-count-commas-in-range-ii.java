class Solution {
    public long countCommas(long n) {
        long l=(long)Math.log10(n)+1;
        if(l<4) return 0;
            long c=0;
        if(n>=(long)Math.pow(10,3) && n<=(long)Math.pow(10,6)-1) c+=(n-1000+1);
        if(n>((long)Math.pow(10,6)-1)) c+=(((long)Math.pow(10,6)-1)-1000+1);
        
        if(n>=(long)Math.pow(10,6) && n<=((long)Math.pow(10,9)-1)) c+=(n-(long)Math.pow(10,6)+1)*2;
        if(n>((long)Math.pow(10,9)-1)) c+=(((long)Math.pow(10,9)-1)-(long)Math.pow(10,6)+1)*2;
        
        if(n>=(long)Math.pow(10,9) && n<=((long)Math.pow(10,12)-1)) c+=(n-(long)Math.pow(10,9)+1)*3;
        if(n>((long)Math.pow(10,12)-1)) c+=(((long)Math.pow(10,12)-1)-(long)Math.pow(10,9)+1)*3;
        
        if(n>=(long)Math.pow(10,12) && n<=((long)Math.pow(10,15)-1)) c+=(n-(long)Math.pow(10,12)+1)*4;
        if(n>((long)Math.pow(10,15)-1)) c+=(((long)Math.pow(10,15)-1)-(long)Math.pow(10,12)+1)*4;

        if(n==(long)Math.pow(10,15)) c+=5;
        return c;
        
        
        // if(n>=(long)Math.pow(10,6)) c+=(n-1000+1);
        // if(n>=(long)Math.pow(10,9)) c+=(n-1000+1);
        // if(n>=(long)Math.pow(10,12)) c+=(n-1000+1);
        // if(n>=(long)Math.pow(10,15)) c+=(n-1000+1);
        
        
    }
}