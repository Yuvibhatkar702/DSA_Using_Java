import java.util.Stack;

public class next_Grater_Element {

    public static void main(String args[]) {

        int arr[] = { 6, 8, 0, 1, 3 };
        int nextG[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        for (int i = arr.length-1; i>=0; i--) {

            // while

            while (!s.empty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // if-else
            if (s.empty()) {
                nextG[i] = -1;
            } else {
                nextG[i] = arr[s.peek()];
            }

            // push in Stack
            s.push(i);

        }

        for (int i = 0; i < nextG.length; i++) {
            System.out.print(nextG[i] + " ");
        }

    }
}
