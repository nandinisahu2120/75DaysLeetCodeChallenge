class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Queue<Integer> q=new LinkedList<>();
        q.offer(source);
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        boolean[] vis=new boolean[n];
        while(!q.isEmpty()){
            int node=q.poll();
            if(node==destination) return true;
            for(int it:adj.get(node)){
                if(!vis[it]){
                    vis[it]=true;
                    q.offer(it);
                }
            }
        }
        return false;
    }
}