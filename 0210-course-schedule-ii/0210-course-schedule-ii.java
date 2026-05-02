class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int V=numCourses;
        int[] ans=new int[V];
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        int[] indeg=new int[V];
        for(int i=0;i<V;i++){
            for(int it:adj.get(i)){
                indeg[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indeg[i]==0) q.offer(i);
        }
        int cnt=0;
        int k=0;
        while(!q.isEmpty()){
            int n=q.poll();
            ans[k++]=n;
             cnt++;
            for(int it:adj.get(n)){
                indeg[it]--;
                if(indeg[it]==0) q.offer(it);
            }
        }
        // Arrays.sort(ans);
        // return ans;
         if(cnt==V) return ans;
         else return (new int[]{});
    }
}
