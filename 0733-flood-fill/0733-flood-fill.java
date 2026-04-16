class Pair{
    int first,second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    
    void bfs(int[][] image,int r,int c,int color,boolean[][] vis){
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(r,c));
        vis[r][c]=true;
        int prevcolor=image[r][c];
        image[r][c]= color;
        int n=image.length;
        int m=image[0].length;
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            q.poll();
            for(int i=1;i<=2;i++){
                for(int j=-1;j<=1;j+=2){
                    int lrow=row;
                    int lcol=col;
                    if(i==1) lrow=lrow+j;
                    else lcol=lcol+j;
                    // System.out.println(lrow+ " "+lcol);
                    // System.out.println(q.peek().first + " "+q.peek().second);
                    if(lrow>=0 && lrow<n && lcol>=0 && lcol<m && image[lrow][lcol]==prevcolor && !vis[lrow][lcol]){
                        vis[lrow][lcol]=true;
                        image[lrow][lcol]=color;
                        q.offer(new Pair(lrow,lcol));
                    }
                }
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] vis=new boolean[image.length][image[0].length];
        bfs(image,sr,sc,color,vis);
        return image;
    }
}