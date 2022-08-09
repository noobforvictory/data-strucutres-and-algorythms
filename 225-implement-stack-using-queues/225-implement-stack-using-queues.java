import java.util.Queue;
class MyStack {
     Queue<Integer> q1;
        
    public MyStack() {
         q1 = new ArrayDeque<>();
         
    }
    
    public void push(int x) {
        if(q1.isEmpty()){
            q1.add(x);
        }else{
            q1.add(x);
            for(int i=0;i<q1.size()-1; i++){
                q1.add(q1.remove());
            }
        }
    }
    
    public int pop() {
        if(q1.isEmpty()){
            return -1;
        }else{
            return q1.remove();
        }
        
    }
    
    public int top() {
        if(q1.isEmpty()){
            return -1;
        }else{
            return q1.peek();
        }
    }
    
    public boolean empty() {
        if(q1.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */