
class Solution {
    boolean bfs(int[] color,List<List<Integer>> adj,int node){
        Queue<Integer> q=new LinkedList<>();
        q.offer(node);
        color[node]=0;
        while(!q.isEmpty()){
            int nodee=q.poll();
            for(int neighbour: adj.get(nodee)){
                if(color[neighbour]==-1){
                    color[neighbour]=1-color[nodee];
                    q.offer(neighbour);
                }
                else{
                    if(color[neighbour]==color[nodee]) return false;
                }
            }
            
        } 
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        List<List<Integer>> adj =new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            adj.add(new ArrayList<>());
            for(int a:graph[i]){
                adj.get(i).add(a);
            }
        }
        int n=graph.length;
        int[] color=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                if(bfs(color,adj,i)==false) return false;
            }
        }
        return true;
    }
}