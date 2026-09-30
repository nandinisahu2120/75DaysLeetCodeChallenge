class Solution {
    public int[] rearrangeArray(int[] nums) {
        TreeMap<Integer, Integer> st = new TreeMap<>();
        for(int it : nums){
            st.put(it, st.getOrDefault(it, 0) + 1);
        }
        int j = 0 ;
        int[] ans = new int[nums.length];
        while(st.size() > 0){
            for(int it : st.keySet()){
                ans[j++] = it;
                st.put(it, st.getOrDefault(it, 0) - 1);
            }
           Iterator<Integer> it = st.keySet().iterator();
           while(it.hasNext()){
            int key = it.next();
            if(st.get(key) == 0){
                it.remove();
            }
           }
        }
        return ans;

    }
}