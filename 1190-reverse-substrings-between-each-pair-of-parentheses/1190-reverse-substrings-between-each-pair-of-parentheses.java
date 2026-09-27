class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder("");
        Stack<String> st = new Stack<>();
        for(int i = 0 ; i < s.length() ;i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(sb.toString());
                sb.setLength(0);
            }
            else if(ch == ')'){
                sb.reverse();
                sb.insert(0 , st.pop());
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}