class Solution {
    boolean isSafe(int n, int m , boolean[][] vis, int x , int y){
        if(x < n && x >= 0 && y < m && y >= 0 && !vis[x][y]) return true;
        else return false;
    }
    void next_move(char ch , int[] nxt_move){
        if(ch == 'R'){
            nxt_move[1]++;
        }
        else if(ch == 'U'){
            nxt_move[0]--;
        }
        else if(ch == 'L'){
            nxt_move[1]--;
        }
        else{
            nxt_move[0]++;
        }
    }
    public int[] lastVisitedCell(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int x = 0 , y = 0 ;
        boolean[][] vis = new boolean[n][m];
        while(true){
            int[] mv = new int[2];
            vis[x][y] = true;
            next_move(grid[x][y] , mv);
            // System.out.println("jbjb" +(x + mv[0])+" "+ (y + mv[1]));
            if(!isSafe(n , m , vis , x + mv[0] , y + mv[1])) break;
            x = x + mv[0];
            y = y + mv[1];
        }
        
        return new int[]{x , y};
    }
}