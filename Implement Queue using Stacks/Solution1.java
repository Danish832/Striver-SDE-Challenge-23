// Queue using two stacks

// Push, pop, top operations in amortized O(1) time .
// Space = O(2N)
// Amortized means operation take O(1) time in most cases
// but sometime takes O(n) time
 
import java.util.*;
class MyQueue {

    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();
    
    public void push(int x) {
       input.add(x);
    }

    public int pop() {
        if(!output.isEmpty()){
            return output.pop();
        }
        else {
            while(!input.isEmpty()){
                output.push(input.pop());
            }
            return output.pop();
        }
        
    }

    public int peek() {
        if(!output.isEmpty()){
            return output.peek();
        }
        else {
            while(!input.isEmpty()){
                output.push(input.pop());
            }
            return output.peek();
        }
    }

    public boolean empty() {
        if(input.isEmpty() && output.isEmpty())return true ;
        return false ;
    }

    public static void main(String args[]){
        MyQueue q = new MyQueue();
        q.push(2);
        q.push(5);
        q.push(3);
        System.out.println(q.peek());
        q.pop();
        q.push(6);
        q.pop();
        q.pop();
        System.out.println(q.peek());
    }
}