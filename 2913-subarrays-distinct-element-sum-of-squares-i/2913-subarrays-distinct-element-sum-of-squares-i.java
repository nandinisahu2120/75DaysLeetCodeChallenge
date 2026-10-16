class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum = 0;
        for(int i = 0 ; i < nums.size() ; i++){
            HashMap<Integer, Integer> st = new HashMap<>();
            for(int j = i ; j < nums.size(); j ++){
                st.put(nums.get(j), st.getOrDefault(nums.get(j), 0) + 1);
                sum += st.size() * st.size();
                //System.out.println(st.get(nums.get(j) ));
            }
        }
        return sum;
    }
}