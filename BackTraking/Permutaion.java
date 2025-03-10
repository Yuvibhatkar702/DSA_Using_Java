public class Permutaion {

    public static void findPermutation(String str, String ans){
        // base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        // recurtion
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            // "abcde" = "ab" + "de" = abde
            String strNew = str.substring(0, i) + str.substring(i+1);
            findPermutation(strNew, ans+curr);
        }
    }
    public static void main(String args[])
    {
        String str = "abc";
        findPermutation(str,"");
    }
}
