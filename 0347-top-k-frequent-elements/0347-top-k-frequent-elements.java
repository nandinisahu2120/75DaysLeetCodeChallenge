class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        for (int key : mp.keySet()) {
            pq.offer(new int[] { key, mp.get(key) });
            if (pq.size() > k)
                pq.poll();
        }
        int[] ar = new int[k];
        for (int i = 0; i < k; i++) {
            ar[i] = pq.poll()[0];
        }
        return ar;
    }
}