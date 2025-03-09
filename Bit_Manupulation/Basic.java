package Bit_Manupulation;

public class Basic {

    public static void main(String args[])
    {
        /*
         * Computer are used a binary Numbers
         * we can convert any number system to any Number system
         * Thare are some Bitwese Oprators HERE..
         * AND ---- &
         * OR ----- | 
         * NOR ---- ^
         * { NOT } On's Complement ------- ~
         * Left-shift <<
         * Rigth-shift >>
        */

        // AND Oprators
        System.out.println(5 & 3);

        //Binay OR
        System.out.println(5 | 3);

        //Biany XOR 
        System.out.println(4 ^ 6);

        // NOT ( One's Complements)
        System.out.println(~7);

        // Find out the Left-Shift Formula :-  ( a << b = a * 2^b )
        System.err.println(6<<3);

        // Right-Shift 
        System.out.println(3>>1);


    }
    
}
