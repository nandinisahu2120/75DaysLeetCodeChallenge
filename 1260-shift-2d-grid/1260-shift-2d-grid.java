class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int total = n * m;
        k=k%total;
        int req = total - k;
        int r = req / n;
        int c = req % n;
        System.out.println("ojjon");
        List<List<Integer>> li = new ArrayList<>();
        if(r>=m)r=r%m;
        if(c>=n)c=c%n;
        for(int  i = 0 ; i < m ; i++){
            li.add(new ArrayList<>());
            for(int j = 0 ; j < n ; j++){
                li.get(i).add(grid[r][c]);
                System.out.print(li.get(i).get(j));
                c++; if(c >= n) {
                    c = c % n;
                    r++;
                    if(r >=m) r = r % m;

                }
                System.out.println();
            }
            //  r++;
        }
        return li;
    }
}