class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> st=new Stack<>();
        int n=temperatures.length;
        int[] answer =new int[n];
        int pos=n;
        for(int i=n-1;i>=0;i--){
            
            while(!st.empty() && temperatures[i] >= st.peek()[0]){
                //c++;
                st.pop();
            }
            answer[i]=(st.empty())?0:(st.peek()[1]-pos);
            st.push(new int[]{temperatures[i],pos});
            pos--;
        }
        return answer;
    }
}
