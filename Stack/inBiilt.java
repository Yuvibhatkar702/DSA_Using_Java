import java.util.*;


public class inBiilt {
    public static void main(String args[]){

        Stack<Integer> s = new Stack<>();

        s.push(11);
        s.push(22);
        s.push(33);

        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();
        }
        
    }


    
}
