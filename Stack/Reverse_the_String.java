import java.util.Stack;

public class Reverse_the_String {

    public static String reverse(String str){

        Stack<Character> s = new Stack<>();
        int index = 0;

        while (index < str.length()) {
            
            s.push(str.charAt(index));
            index++;
        }

        StringBuilder st = new StringBuilder();

        while (!s.isEmpty()) {
            
            char c = s.pop();
            st.append(c);
        }

        return st.toString();
    }
    public static void main(String args[])
    {
        String str = "Yuvraj";
        System.out.println("Befour the Fuction Call" + str);
        String result = reverse(str);
        System.out.println("After function call" + result);
    }
}
