package Strings;

public class Convert_UpperCase {

    public static void main(String args[])
    {
        String Name = "yuvraj gajanan bhatkar";

        StringBuilder sb = new StringBuilder(" ");

        sb.append(Character.toUpperCase(Name.charAt(0)));

        for(int i=1; i<Name.length(); i++)
        {
            if(Name.charAt(i) == ' ' &&  i < Name.length()-1)
            {
                sb.append(Name.charAt(i));
                i++;
                sb.append(Character.toUpperCase(Name.charAt(i)));
                
            }else{
                sb.append(Name.charAt(i));
            }
        }

        System.out.println(sb);
    }
    
}
