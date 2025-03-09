public class Lecture_15{

    public static void Pattern(int a,int b)
    {
        for(int i = 1; i<= b; i++)
        {
            for(int j = 1; j <= a; j++)
            {
                if(i == 1 || i == a || j == 1 || j == b)
                {
                    System.out.println("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Pattern(5,4);
    }
}