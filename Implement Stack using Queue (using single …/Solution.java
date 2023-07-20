import java.util.* ;

// Using single queue, rotating the queue to behave like stack
// push operation O(N) time

class MyStack {
        
    private Queue<Integer> queue = new LinkedList<>();

    public void push(int x) {
        queue.add(x);
        for (int i=1; i<queue.size(); i++)
            queue.add(queue.remove());
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String args[]){
        MyStack obj = new MyStack() ;
        obj.push(4);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.pop();
        System.out.println(obj.top());
    }

}