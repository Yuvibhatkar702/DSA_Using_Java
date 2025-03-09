import java.util.Stack;

public class Reverse_the_Stack {

    public static void pushBottom(Stack<Integer> s, int data){

        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int Top = s.pop();
        pushBottom(s, data);
        s.push(Top);
        
    }

    public static void reverseStack(Stack<Integer> s){

        if(s.isEmpty()){
            return;
        }

        int top = s.pop();

        reverseStack(s);

        pushBottom(s, top);

    }

    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String args[]){

        Stack<Integer> s = new Stack<>();

        s.push(11);
        s.push(22);
        s.push(33);
        s.push(44);

        
        
        //printStack(s);
        reverseStack(s);
        System.out.println("After reverse the Stack");
        printStack(s);
    }
}
