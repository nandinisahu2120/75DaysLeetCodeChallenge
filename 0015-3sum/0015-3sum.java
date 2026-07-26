class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        HashSet<List<Integer>> st = new HashSet<>();
        int n = nums.length;
        for(int i = 0 ;i < n ; i++){
            HashSet<Integer> hp = new HashSet<>();
            for(int j = i + 1; j < n ; j++){
                if(hp.contains( -(nums[i] + nums[j]))){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(-(nums[i] + nums[j]));
                    temp.add(nums[j]);
                    Collections.sort(temp);
                    st.add(temp);
                }
                hp.add(nums[j]);
            }
        }
        for(List<Integer> it: st){
            li.add(it);
        }
        return li;
    }
}