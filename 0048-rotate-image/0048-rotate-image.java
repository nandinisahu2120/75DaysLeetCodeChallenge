class Solution {
    void reverse(int[] ar){
        int s=0,e=ar.length-1;
        while(s<e){
            int t=ar[s];
            ar[s]=ar[e];
            ar[e]=t;
            s++;
            e--;
        }
    }
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i>j){
                    int t=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=t;
                }
            }
        }
        for(int i=0;i<n;i++){
            reverse(matrix[i]);
        }
    }
}