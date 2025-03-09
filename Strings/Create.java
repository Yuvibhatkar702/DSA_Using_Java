package Strings;
import java.util.Scanner;

public class Create {
    public static void main(String args[]) {
        String arr[] = {"Yuvraj","Akash","Sunny","Gajanan","Madhuri","Kamla"};

        String Str[] = new String[5];

        String aee = new String("XYZ");

        String harr = "Bhatkar";

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<Str.length; i++)
        {
        //Str[i] = sc.next(); // takes only single String.
        System.out.println("Enter a String :- ");
        Str[i] = sc.nextLine(); // takes multiple lines.
        }

        for(int i=0; i<Str.length; i++)
        {
        System.out.print(Str[i] + ", ");
        }

        
    }
}
