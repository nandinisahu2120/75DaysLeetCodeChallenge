class Solution {
    int largestRectngleArea(int[] arr){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int max=0;
        // int m=matrix[0].length;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                int ele=st.pop();
                int nse=i;
                int pse=st.isEmpty()?-1:st.peek();
                int area=arr[ele]*(nse-pse-1);
                max=Math.max(max,area);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int ele=st.pop();
            int nse=n;
            int pse=st.isEmpty()?-1:st.peek();
            int area=arr[ele]*(nse-pse-1);
            max=Math.max(max,area);
        }
        return max;
    }
    public int maximalRectangle(char[][] matrix) {
        int n=matrix[0].length;
        int m=matrix.length;
        int max=0;
        int[] dp = new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='0') dp[j]=0;
                else {
                    dp[j]++;

                }
            }
                int area=largestRectngleArea(dp);
                max=Math.max(max,area);
        }
        return max;
    }
}