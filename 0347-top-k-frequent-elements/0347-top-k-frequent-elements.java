class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        PriorityQueue<int[]> pque = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        for (int key : mp.keySet()) {
            pque.offer(new int[] { key, mp.get(key) });
            if (pque.size() > k)
                pque.poll();
        }
        int[] ar = new int[k];
        for (int i = 0; i < k; i++) {
            ar[i] = pque.poll()[0];
        }
        return ar;
    }
}