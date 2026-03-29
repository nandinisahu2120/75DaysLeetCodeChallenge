class EventManager {
    PriorityQueue<int[]> pq;
    Map<Integer, Integer> mp;

    public EventManager(int[][] events) {
        pq = new PriorityQueue<>((a, b) -> {
            if (a[1] == b[1])
                return a[0] - b[0];
            else
                return b[1] - a[1];
        });
        mp = new HashMap<>();
        for (int[] a : events) {
            pq.add(a);
            mp.put(a[0], a[1]);
        }

    }

    public void updatePriority(int eventId, int newPriority) {
        mp.put(eventId, newPriority);
        pq.add(new int[] { eventId, newPriority });
    }

    public int pollHighest() {
        while (!pq.isEmpty()) {
            int[] ev = pq.poll();
            if (mp.containsKey(ev[0]) && mp.get(ev[0]) == ev[1]){
                mp.remove(ev[0]);
                return ev[0];
            }
        }
        return -1;
    }
}

/**
 * Your EventManager object will be instantiated and called as such:
 * EventManager obj = new EventManager(events);
 * obj.updatePriority(eventId,newPriority);
 * int param_2 = obj.pollHighest();
 */