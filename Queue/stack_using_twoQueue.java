import java.util.*;

public class stack_using_twoQueue {

    static class Stack{

        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        //isEmaty
        public boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        //addElement

        public void push(int data){

            if(!q1.isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
        }

        // RemoveElement

        public int pop(){

            if(isEmpty()){
                System.out.println("Stack is Ematy");
                return -1;
            }

            int TOP = -1;
            if(!q1.isEmpty()){ // Case 1

                while (!q1.isEmpty()) {
                    TOP = q1.remove();
                    if(!q1.isEmpty()){
                        break;
                    }
                    q2.add(TOP);
                }

            }else{ // Case 2

                while (!q2.isEmpty()) {
                    TOP = q2.remove();
                    if(!q2.isEmpty()){
                        break;
                    }
                    q1.add(TOP);
                }
            }

            return TOP;
        }

        // Peek

        public int peek(){
            
            if(isEmpty()){
                System.out.println("Stack is Ematy");
                return -1;
            }

            int TOP = -1;

            if(!q1.isEmpty()){

                while (!q1.isEmpty()) {
                    TOP = q1.remove();
                    q2.add(TOP);    
                }
            }else{

                while (!q2.isEmpty()) {
                    TOP = q2.remove();
                    q1.add(TOP);
                }
            }

            return TOP;
        }

    }
    public static void main(String args[]){ // Not Working
        Stack s = new Stack();

        s.push(11);
        s.push(22);
        s.push(33);
        s.push(44);


        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
