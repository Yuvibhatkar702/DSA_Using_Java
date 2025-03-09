package Strings;

import java.util.Scanner;

public class Palindrom {

    public static boolean CheckPalindrom(String p)
    {
        for(int i=0; i<p.length()/2; i++)
        {
            if(p.charAt(i) != p.charAt(p.length()-1-i))
            {
                return false;
            }
        }

        return true;
    }
    public static void main(String args[])
    {
        String Pal = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the World To Check :- ");
        Pal= sc.next();

        boolean b = CheckPalindrom(Pal);
        System.out.println(b);

       
    }
    
}
