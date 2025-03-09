package Bit_Manupulation;

public class Odd_Even_numbe {

    public static void Check_Odd_Even(int n)
    {
        int makes = 1;

        if( (n & makes) == 0)
        {
            System.out.println("even Number");
        }else{
            System.out.println("The Given Number is odd Number");
        }
    }

    // Get i th Number.
    public static int find_nth_Bit(int n, int i)
    {
        int r = n >> i & 1;

        if( r == 1)  // 5 >> 1 = 101 >> 10 
        {
           return 1;
        }else{
            return 0;
        }
    }

    // i th Bit 

    public static int Set_Ith_Bit(int n, int i)
    {
        int r = 1<<i;
        return r | n;
    }

    public static int Remove_nth_Bit(int n, int i)
    {
        int r = ~(1 << i);
        return n & r;
    }

    public static int Updation_Bit(int n , int i , int DA)
    {
        if(DA == 1)
        {
            int r = 1 << i;
            return r | n;
        }else{
            int t = ~(1 << i);
            return t & n;
        }
    }

    public static int Clear_last_ith_Bit(int n, int i)
    {
        int q = (-1<<i);
        return n & q;
    }

    public static int Clear_bit_Range(int n, int i, int j) //Not-Understandeble
    {   
        int a = ((-0)<<(j+1));  
        int b = (1<<i)-1;
        int bitMarks = a | b;
         

        return n & bitMarks;  
    }

    public static boolean Two_Power(int a)
    {
        return (a & (a-1)) == 0;
    }

    public static int Count_Ones(int n) // IMP Qustions
    {
        int count = 0;
        while (n > 0) {
            if((n & 1) != 0){
                count++;
            }
            n = n >> 1;
        }

        return count;
    }

    public static int power(int a, int n) // Not Understad
    {
        int num = 1;

        while (n > 0) {

            if( (1 & -1) != 0)
            {
                num = num * a;
            }
            a = a * a;
            n = n>>1;
            
        }

        return num;
    }


    public static void main(String args[])
    {
        // Check_Odd_Even(3);
        // Check_Odd_Even(6);

        // int n = find_nth_Bit(5, 1);
        // System.out.println(n);

        // int n = Set_Ith_Bit(4, 1);
        // System.out.println(n);

        // int n = Remove_nth_Bit(8, 3);
        // System.out.println(n);

        // int n = Updation_Bit(5,2,0);
        // System.out.println(n);

        // int n = Clear_last_ith_Bit(12,2);
        // System.out.println(n);

        // int n = Clear_bit_Range(7,1,2);
        // System.out.println(n);

        // boolean n = Two_Power(8);
        // System.out.println(n);

        //System.out.println(Count_Ones(5));

        System.out.println(power(5, 3));
    }   
    
}
