import java.util.*;

public class Valid_Anagram {

    public static boolean getAnagram(String s1, String s2){

        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i = 0; i<s1.length(); i++){
            hm.put(s1.charAt(i),hm.getOrDefault(s1.charAt(i), 0)+1);
        }

        for(int i=0; i<s2.length(); i++){
            char ch = s2.charAt(i);
            
            if(hm.get(ch) != null){
                if(hm.get(ch) == 1){
                    hm.remove(ch);
            }else {
                hm.put(s2, hm.get(ch) - 1);
            }

            }else{
                return false;
            }
        }

        return hm.isEmpty();
    }
    public static void main(String args[]){

        String s1 = "race";
        String s2 = "care";

        
    }
}
