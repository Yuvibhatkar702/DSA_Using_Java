import java.util.Stack;

public class pushBottam {

    public static void Buttom(Stack<Integer> s, int data){
        
        if(s.empty()){
            s.push(data);
            return;
        }

        int top = s.pop();

        Buttom(s, data);  // it will create a In-built Stack
        s.push(top);
    }
    public static void main(String args[]){

        Stack<Integer> s = new Stack<>();

        s.push(11);
        s.push(22);
        s.push(33);

        Buttom(s , 44);

        while (!s.isEmpty()) {
            System.out.println(s.pop() + " ");
        }
    }
}
