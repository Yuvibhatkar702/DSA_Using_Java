import java.util.Stack;

public class Practice {

    public static void isValid(int arr[]){

        int Max = 0;
        int rs[] = new int[arr.length];
        int ls[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        // Right Small
        for(int i=arr.length-1; i>=0; i--){ // rs

            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if(s.isEmpty()){
                rs[i] = arr.length-1;
            }else{
                rs[i] = s.peek();
            }

            s.push(i);
        }

        // Left side 

        for(int j=0; j<=arr.length-1; j++){

            while (!s.isEmpty() && arr[s.peek()] >= arr[j]) {
                s.pop();
            }

            if(s.isEmpty()){
                ls[j] = -1;
            }else{
                ls[j] = s.peek();
            }

            s.push(j);
        }

        // total areas

        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int weith = rs[i] - ls[i] - 1;
            int total = height * weith;
            Max = Math.max(Max, total); 
        }
        
        System.out.println("The Max VAlue is = " + Max);          

    }

    public static boolean Para(String str){

        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{'){
                s.push(ch);
            }else{
                
                if(s.isEmpty()){
                    return false;
                }else{

                    if(s.peek() == '(' && ch == ')'  || s.peek() == '[' && ch == ']' || s.peek() == '{' && ch == '}'){ // find out the pairs
                        s.pop();
                    }else{
                        return false;
                    }
                }
            }

        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }

    }

    public static String reverseString(String str){

        Stack<Character> s = new Stack<>();
        String stre  = "";
        int index = 0;

        while (index < str.length()) {
            s.push(str.charAt(index));
            index++;
        }

        while (!s.isEmpty()) {
            str = str + s.pop();      
        }

        return stre;

    }
    public static void main(String args[]){
        int arr[] = {2,1,5,6,2,3};
        //isValid(arr);

        String str = "{()}]";
        //System.out.println(Para(str));

        String str2 = "Yuvraj";
        String result = reverseString(str2);
        System.out.println(result);
    }       
}
