class Solution {
    
    public int[] validSequence(String word1, String word2) {
        //if(word2.length() == 1) return new int[]{0};
       int[] last = new int[word2.length()];
        int j = word2.length() - 1;
       for(int i = word1.length() - 1 ; i >= 0 && j >= 0; i--){
            if(word1.charAt(i) == word2.charAt(j)){
                last[j] = i;
                j--;
            }
       } 
       int k = 1;
       for(int i = 0 ; i <= j ; i++) {
        last[i] = -1 * k;
        k++;
       }
       int[] ans = new int[word2.length()];
       j = 0;
           //for(int i = 0 ; i < last.length ; i++)
            //System.out.print(last[i] + " ");
       boolean mismatched = false;
       for(int i = 0 ; i < word1.length() && j < word2.length() ;i++){
            if(word1.charAt(i) == word2.charAt(j) || (!mismatched && i + 1 < word1.length() && ((j + 1 < word2.length() && i + 1 <= last[j + 1]) || j == word2.length() - 1))){
                if(word1.charAt(i) != word2.charAt(j)){
                    mismatched = true;
                }
                ans[j] = i;
                j++;
            }

       }
       if(j != word2.length()) return new int[]{};
       return ans;
    }
}