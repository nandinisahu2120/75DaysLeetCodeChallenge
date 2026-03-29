class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        if(s1.equals(s2)) return true;
        if(((c1[0]==c2[2] && c1[2]==c2[0] && c1[3]==c2[3] && c1[1]==c2[1] )|| ( c1[0]==c2[2] && c1[2]==c2[0] && c1[1]==c2[3] && c1[3]==c2[1])) || ((c1[0]==c2[0] && c1[2]==c2[2] && c1[3]==c2[1] && c1[1]==c2[3] )|| ( c1[0]==c2[0] && c1[2]==c2[2] && c1[1]==c2[1] && c1[3]==c2[3]))) return true;
        else return false;
    }
}