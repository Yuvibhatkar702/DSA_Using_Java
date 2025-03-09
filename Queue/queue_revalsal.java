import java.util.*;

public class queue_revalsal {

    public static void Revalsal(Queue<Integer> q){

        Stack<Integer> s = new Stack<>();

        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }
       
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();

        q.add(11);
        q.add(22);
        q.add(33);
        q.add(44);
        q.add(55);
        q.add(66);

        // while (!q.isEmpty()) {
        //     System.out.print(q.peek() + " ");
        //     q.remove();
        // }

        //System.out.println();

        Revalsal(q);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }   
}
