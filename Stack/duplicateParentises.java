import java.util.*;

public class duplicateParentises {

    public static boolean Valid(String str){

        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){

            char ch =str.charAt(i);

            if(ch == ')'){ /// Closing
                int cout = 0;

                while(s.peek() != '(')
                {
                    s.pop();
                    cout++;
                }

                if(cout < 1){
                    return true; // Duplicate
                }else{
                    s.pop(); // Opning Pair
                }
            }
            else{
                // Opning 
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        String str = "((a+b))";
        String str2 = "(a-b)";

        System.out.println(Valid(str));
    }
}
