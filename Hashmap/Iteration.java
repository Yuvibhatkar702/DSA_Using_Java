import java.util.*;

public class Iteration {    
    public static void main(String args[]){

        HashMap<String,Integer> hp = new HashMap<>();

        hp.put("India", 5000);
        hp.put("France", 2000);
        hp.put("UK", 1000);
        hp.put("US", 50000);

        Set<String> key = hp.keySet();

        for(String i : key){
            System.out.println("Key :- " + i + ", values :- " + hp.get(i));
        }
    }
    
}
s