import java.util.Deque;
import java.util.LinkedList;

public class dqeueu {
    public static void main(String args[]){

        Deque<Integer> dq = new LinkedList<>(); // Not using stack

        dq.addFirst(11);
        dq.addFirst(55);
        dq.addLast(33);
        dq.addLast(22); // 55 11 33 22 

        System.out.println(dq);

        dq.removeFirst();
        dq.remove();
        dq.removeLast(); // 33

        System.out.println(dq); 
    }

}
