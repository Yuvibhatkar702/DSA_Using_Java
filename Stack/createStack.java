import java.util.ArrayList;

public class createStack {

    // Stack is a Lineare data Structure. used the Fist in last Out Approch.
    // We Implement the Stack Using Arrays, ArrayList, and Linked-List.
    // But array is Fixed Size And Stack is Nth Side that Why we can not pprefer the
    // Implement the Stack Using arrray.
    // // We can seen the Implemetaion Stack using Arraylist and Link-List.

    static class Stack {

        // Implement the Stack using ArrayList
        static ArrayList<Integer> arr = new ArrayList<>();

        // Methode 1 isEmpty()
        public boolean isEmpty() {
            return arr.isEmpty();
        }

        // Methode 2 Push();
        public void Push(int data) {
            arr.add(data);
        }

        // Methode 3 Pop()
        public int Pop() {

            if (arr.isEmpty()) {
                return -1;
            }
            int TOP = arr.get(arr.size() - 1);

            arr.remove(arr.size() - 1);
            return 0;
        }

        // Methode 4 Pick()
        public int Pick() {

            if (arr.isEmpty()) {
                return -1;
            }

            return arr.get(arr.size() - 1);
        }
    }

    public static void main(String args[]) {

        Stack s = new Stack();

        s.Push(11);
        s.Push(22);
        s.Push(33);
        s.Push(44);

        while (!s.isEmpty()) {
            System.out.println(s.Pick());
            s.Pop();
        }

        System.out.println(s.Pick());  // -1
    }
}