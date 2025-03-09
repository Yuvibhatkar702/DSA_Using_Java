public class Lecture_13{

    
    public static void main(String args[])
    {
        // Trangle Pattern 

        for(int i = 1; i <= 4; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        
        
        // Inverse Trangle 

        for(int i = 4; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        //  Print Numbers in trangle Pattern

        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        // print Charectors in trangle Pattern
        char ch = 'A';

        for(int i = 1; i <= 4; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

        
    }
}