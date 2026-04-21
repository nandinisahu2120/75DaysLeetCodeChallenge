class Solution {
    boolean dfs(int[] vis,int[] pathvis,int[] check,int node,List<List<Integer>> adj){
        vis[node]=1;
        pathvis[node]=1;
        for(int neighbour:adj.get(node)){
            if(vis[neighbour]==0){
                if(dfs(vis,pathvis,check,neighbour,adj)) return true;
            }
            else if(pathvis[neighbour]==1) return true;
        }
        check[node]=1;
        pathvis[node]=0;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
            for(int j:graph[i]){
                adj.get(i).add(j);
            }
        }
        int[] vis=new int[n];
        int[] pathvis=new int[n];
        int[] check=new int[n];
        for(int i=0;i<n;i++){
            dfs(vis,pathvis,check,i,adj);
        }
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(check[i]==1)
                li.add(i);
        }
        Collections.sort(li);
        return li;
    }
}