class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<num.length();i++){
            while(sb.length()!=0 && sb.charAt(sb.length()-1)>num.charAt(i) && k>0){
                sb.deleteCharAt(sb.length()-1);
                k--;
            }
            sb.append(num.charAt(i));
        }
        while(k>0 && sb.length()!=0){
        sb.deleteCharAt(sb.length()-1);
        k--;
        }
        System.out.println(sb.toString());
        while(sb.length()!=0 && sb.charAt(0)=='0') 
            sb.deleteCharAt(0);
        if(sb.length()==0) return "0";
        return sb.toString();
    }
}