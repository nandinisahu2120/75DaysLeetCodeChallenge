class Solution {
    public String[] createGrid(int m, int n) {
        String[] st = new String[m];
        StringBuilder sb= new StringBuilder();
        sb.append('.');
        for(int i = 1 ;i < n ; i++){
            sb.append('#');
        }
        for(int i = 0;i < m - 1;i++){
            st[i] = sb.toString();
        }
        sb.setLength(0);
        for(int i = 0 ;i< n;i++){
            sb.append('.');
        }
        st[m - 1] = sb.toString();
        return st;
    }
}