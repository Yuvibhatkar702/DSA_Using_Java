

public class Subset{

    public static void Set(String str, String s, int inx){

        if(inx == str.length()){
            System.out.println(s);
            return;
        }
       
        Set(str, s + str.charAt(inx), inx+1);
        Set(str, s, inx+1);
    }   
    public static void main(String args[])
    {
        String str = "abc";
        String str2 = "";
        Set(str,str2, 0);
        
    }
}