import java.util.Stack;

public class Stock_Span {

    public static void CalculateSpan(int Stack[], int Span[]){

        Stack<Integer> s = new Stack<>();

        Span[0] = 1;
        s.push(0);

        for(int i=1; i<Stack.length; i++){
            int curr = Stack[i];

            while (!s.isEmpty() && curr > Stack[s.peek()]) {
                s.pop();
            }

            if(s.isEmpty()){
                Span[i] = i + 1;
            }else{
                int prvHeight = s.peek();
                Span[i] = i - prvHeight;
            }

            s.push(i);
        }
    }
    public static void main(String args[]){

        int Stack[] = {100,80,60,70,60,85,100};
        int Span[] = new int[Stack.length];

        CalculateSpan(Stack, Span);

        for(int i=0; i<Span.length; i++){
            System.out.print(Span[i] + " ");
        }
    }

}
