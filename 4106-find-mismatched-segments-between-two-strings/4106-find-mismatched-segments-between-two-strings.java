class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        int i = 0 , j = 0;
        int n = s1.length();
        List<List<String>> li = new ArrayList<>();
        while(j < n){
            if(s1.charAt(j) ==  s2.charAt(j)){
                if( i != j){
                    li.add(new ArrayList<>());
                    li.get(li.size() - 1).add(s1.substring(i, j));
                    li.get(li.size() - 1).add(s2.substring(i, j));
                }
                j++;
                i = j;
            }
            else j++;
        }
        if(i != j){

                li.add(new ArrayList<>());
                li.get(li.size() - 1).add(s1.substring(i, j));
                li.get(li.size() - 1).add(s2.substring(i, j));
        }
        return li;
    }
}