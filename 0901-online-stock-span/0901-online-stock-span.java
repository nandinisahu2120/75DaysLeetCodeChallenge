class StockSpanner {
    Stack<int[]> st;
    // int[] span;
    public StockSpanner() {
    //    span=new int[]
        st=new Stack<>();
    }
    
    public int next(int price) {
        int cal=1;
        while(!st.isEmpty() &&  st.peek()[0]<=price){
            cal+=st.pop()[1];
        }
        st.push(new int[]{price,cal});
        return cal;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */