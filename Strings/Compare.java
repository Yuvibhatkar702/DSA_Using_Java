package Strings;

public class Compare {
    public static void main(String args[])
    {
        String s1 = "Yuvraj";
        String s2 = "Yuvraj";

        if(s1 == s2){
            System.out.println("String are Same");
        }else{
            System.out.println("String are not same");
        }

        String s3 = new String("Yuvraj");

        if(s1.equals(s3)){
            System.out.println("String are same");
        }else{
            System.out.println("String are not same");
        }
    }
    
}
