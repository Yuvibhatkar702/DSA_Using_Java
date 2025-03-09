import java.util.*;

public class Stack_Using_Dque {

    public static class Stack{
        
        Deque<Integer> dq = new LinkedList<>();

        // Addelement
        public void push(int data){
            dq.addLast(data);
        }

        // DeleteElement
        public int pop(){
            int temp = dq.removeLast();
            return temp;
        }

        //peek
        public int peek(){
            return dq.getLast();
        }
    }
    
    public static void main(String args[]){

        Stack s = new Stack();

        s.push(11);
        s.push(22);
        s.push(33);
        
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
    }
}
