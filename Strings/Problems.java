package Strings;
import java.util.Scanner;

public class Problems {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(" ");

        System.out.println("Enter the String :- "); //    Count how many times lower case Vowels 
        sb.append(sc.nextLine());

        int count = 0;

        for(int i = 0; i<sb.length(); i++)
        {
            if(sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u' ){
                count++;
            }
        }

        System.out.println(count);
        System.out.println(sb.toString());

    }
    
}
