import java.util.LinkedList;
import java.util.Deque;

public class queue_using_deque {

    public static class Queue{

        Deque<Integer> dq = new LinkedList<>();

        // addElement
        public void add(int data){
            dq.addLast(data);
        }

        //removeElement
        public void remove(){
            dq.removeFirst();
        }

        //peek
        public int peek(){
            return dq.getFirst();
        }
    }
    public static void main(String args[])
    {
        Queue q = new Queue();

        q.add(11);
        q.add(22);
        q.add(33);

        System.out.print(q.peek() + " ");
        q.remove();
        System.out.print(q.peek() + " ");
        q.remove();
        System.out.print(q.peek() + " ");

        
    }
}
