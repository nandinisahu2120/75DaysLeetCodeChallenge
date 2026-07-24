class Pair{
    int ele, cnt;
    Pair(int ele, int cnt){
        this.ele = ele;
        this.cnt = cnt;
    }
}
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hp = new HashMap<>();
        hp.put(0,1);
        int sum = 0, cnt = 0;
        for(int it: nums){
            sum += it;
            if(hp.containsKey(sum - k)){
                cnt += hp.get(sum - k);
            }
            hp.put(sum, hp.getOrDefault(sum ,0) + 1);
        }
        return cnt;
    }
}