package Strings;

public class Serach_Ellemet {
    public static void main(String args[]) {

        //Add 2 String (Concatenate)

        String A = "Ramayana";
        String B = "Mahabharat";
        String sunsckuti = A + ", " + B;

        System.out.println(sunsckuti);

        System.out.println(sunsckuti.charAt(0)); // Print single Charectores

        // to print all carectores..

        for (int i = 0; i < sunsckuti.length(); i++) {
            System.out.print(sunsckuti.charAt(i) + ", ");
        }

    }

}
