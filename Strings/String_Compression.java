package Strings;

public class String_Compression {
    public static void main(String args[])
    {
        String str = "aaabbcccdd";  // output :- a3b2c3d2
        StringBuilder sb = new StringBuilder(" ");

        for(int i=0; i<str.length(); i++)
        {
            Integer count = 1;

            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {

                    count++; 
                    i++;
            }

            sb.append(str.charAt(i));     
            
            if(count > 1)
            {
                sb.append(count);
            }
            
        }

        System.out.println(sb.toString());
    }
}
