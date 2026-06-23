class Solution {
    public int[] replaceElements(int[] arr) {
        int gr = -1;
        for(int i = arr.length - 1; i >=0 ;i--){
            int t = gr;
            gr = Math.max(gr, arr[i]);
            arr[i] = t;
        }
        return arr;
    }
}