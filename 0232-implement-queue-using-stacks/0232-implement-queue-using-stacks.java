class MyQueue {
Stack<Integer> st1;
Stack<Integer> st2;
int currsize;

    public MyQueue() {
        st1=new Stack<>();
        st2=new Stack<>();
        currsize=0;
    }
    
    public void push(int x) {
        st1.push(x);
        currsize++;
    }
    
    public int pop() {
        if(st2.empty()){
            if(st1.empty())
                return -1;
            while(!st1.empty())
            st2.push(st1.pop());
        }
        currsize--;
        return st2.pop();
    }
    
    public int peek() {
        if(st2.empty()){
            if(st1.empty())
                return -1;
            while(!st1.empty())
            st2.push(st1.pop());
        }
        return st2.peek();
    }
    
    public boolean empty() {
        return (currsize==0);
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
