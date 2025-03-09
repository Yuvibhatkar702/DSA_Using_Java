package Strings;

public class SubString {

    public static String SubString(String s1, int start, int end){

        String sub = "";

        for(int i=start; i<end; i++)
        {
            sub += s1.charAt(i);
        }
        return sub;
    }
    public static void main(String args[])
    {
        String s = "Yuvraj";

        String now = SubString(s,1,3);
        System.out.println(now);
    }
    
}
