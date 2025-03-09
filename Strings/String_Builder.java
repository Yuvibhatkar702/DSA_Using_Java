package Strings;

public class String_Builder {
    
    public static void main(String args[])
    {
        StringBuilder sb = new StringBuilder(" ");

        for(char ch='a'; ch<='z'; ch++)
        {
            sb.append(ch + " ");
        }
        System.out.print(sb);

        // sb.append("Yuvraj ");
        // sb.append("Akash");
        // sb.append("Sunny");
        // sb.append("Gajanan");



        // a.toString();

        // System.out.println(a.getClass().getSimpleName());
    
        //System.out.println(sb);
    }
    /*
        String-Builder is same as String.
        if we perfrom same opration on string then we can used the String-Builders.
        It will takes a less time to excution of a program 
        We can Do all Opratio on String-Builders 
    */

   
    
}
