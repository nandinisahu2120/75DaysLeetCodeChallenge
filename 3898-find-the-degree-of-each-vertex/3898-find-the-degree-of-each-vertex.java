class Solution {
    public int[] findDegrees(int[][] matrix) {
        int i=0;
        int[] arr=new int[matrix.length];
        for(int[] a:matrix){
            int sum=0;
            for(int k:a){
                sum+=k;
            }
            arr[i++]=sum;
        }
        return arr;
    }
}