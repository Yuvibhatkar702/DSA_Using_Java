import java.util.*;

public class LinkMap{

    // Linked Hash Map is a Sorted ( OrderWise ) Hash Map that show the data accourding to User input.
    // In Linked Link list Doubbly link List is Used.

    public static void main(String args[]){

        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("India",2000);
        lhm.put("Brazil",1000);
        lhm.put("UK",500);

        System.out.println(lhm);

        HashMap<String, Integer> hm = new HashMap<>();
        
        hm.put("India",2000);
        hm.put("Brazil",1000);
        hm.put("UK",500);

        System.out.println(hm);
    }
}
