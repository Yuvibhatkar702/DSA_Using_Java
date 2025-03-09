import java.util.Stack;

class validParentises{

    public static boolean isvalid(String str){

        Stack<Character> ch = new Stack<>();

        for(int i=0; i<str.length(); i++){

            char temp = str.charAt(i);

            if(temp == '(' || temp == '{' || temp == '['){ // push opration
                ch.push(temp);

            }else{

                if(ch.isEmpty()){
                    return false;
                }

                if( (ch.peek() == '(' && temp == ')' 
                    || ch.peek() == '{' && temp == '}'
                    || ch.peek() == '[' && temp == ']') ) // paire from or not
                {
                    ch.pop();
                }else{
                    return false;
                }
            }
        }
        
        if(ch.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String args[]){

        String str = "({})[]";

        System.out.println(isvalid(str));
    }
}