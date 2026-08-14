class Solution {
    public String convert(String s, int numRows) {
        List<List<Character>> li = new ArrayList<>();
        for(int i = 0 ; i  < numRows ; i++){
            li.add(new ArrayList<>());
        }
        int j = 0 ;
        while(j <  s.length()){
            for(int i = 0 ; i < numRows && j <  s.length() ; i++){
                li.get(i).add(s.charAt(j)); 
                j++;
            }
            for(int i = numRows - 2; i > 0 && j <  s.length(); i--){
                li.get(i).add(s.charAt(j)); 
                j++;

            }
        }
        StringBuilder sb = new StringBuilder();
        for(List<Character> it : li){
            for(char c : it){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}