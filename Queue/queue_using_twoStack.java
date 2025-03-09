import java.util.Stack;

public class queue_using_twoStack {

    public static class Queue { // IMP Question

        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // isEmaty

        public boolean isEmpty() {
            return s1.empty();
        }

        // addElement

        public void add(int data) {

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // removeElement

        public int remove() {
            if (s1.isEmpty()) {
                System.out.println("Queue is Ematy");
                return -1;
            }

            return s1.pop();
        }

        // peek

        public int peek() {
            if (s1.isEmpty()) {
                System.out.println("Queue is Ematy");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String args[]) {

        Queue q = new Queue();

        q.add(11);
        q.add(22);
        q.add(33);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
