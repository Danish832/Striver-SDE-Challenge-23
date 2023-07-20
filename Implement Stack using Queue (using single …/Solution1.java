import java.util.* ;

// Using double queue, rotating the queue to behave like stack
// push operation O(N) time

class MyStack {
        
    private Queue<Integer> q1= new LinkedList<>();
    private Queue<Integer> q2= new LinkedList<>();
    private int top ;

    public void push(int x) {
        q2.add(x);
        top = x ;
        while(q1.size()>1){
            q2.add(q1.remove());
        }
        Queue<Integer>temp = q1 ;
        q1 = q2 ;
        q2 = temp ;
    }

    public int pop() {
        return q1.remove();
    }

    public int top() {
        return top;
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String args[]){
        MyStack obj = new MyStack() ;
        obj.push(4);
        obj.push(1);
        // obj.push(2);
        // obj.push(3);
        obj.pop();
         obj.push(45);
        //  obj.push(100);
        System.out.println(obj.top());
    }

}