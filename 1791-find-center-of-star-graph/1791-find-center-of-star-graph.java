class Solution {
    public int findCenter(int[][] edges) {
        List<List<Integer>> adj =new ArrayList<>();
        for(int i=0;i<=edges.length;i++){
            adj.add(new ArrayList<>());
        }
        int[] degree=new int[edges.length+2];
        for(int i=0;i<edges.length;i++){
            degree[edges[i][0]]++;
            degree[edges[i][1]]++;
            if( degree[edges[i][0]]>1) return edges[i][0];
            if( degree[edges[i][1]]>1) return edges[i][1];
        }
        return 0;
    }
}