import java.util.*;

public class queue_using_JCF { // Using Java Collection FremWork 
    public static void main(String args[]){

       // Queue<Integer> q = new LinkedList<>(); 
        // Queue is an Interface, Not a Class
        // that way's we can not Creare an Object 
        // we can create a Q Using LinkList class and ArrayDeque

        Queue<Character> q = new ArrayDeque<>();


        // q.add(11);
        // q.add(22);
        // q.add(33);

        q.add('A');
        q.add('B');
        q.add('C');

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
