import java.util.*;

class Theory{
    public static void main(String args[]){

        /*
            Threre are 3 types of map 1. HashMap  2. LinkedHashMap  3. Tree Map
            java Hash Map Singly Link List data structure is used is Used.
            Java HashMap contains values based on the key.
            Java HashMap contains only unique keys.
            Java HashMap may have one null key and multiple null values.
            Java HashMap is non synchronized.
            Java HashMap maintains no order.
            The initial default capacity of Java HashMap class is 16 with a load factor of 0.75. 
            HashMap is UnOrder data Structure.
            all thoes HashMap time Complecity is O(1) but some time in the Wost it will be a O(n) whean key is always return same Bucket Index 
        */

        // Create
        HashMap<String, Integer> hp = new HashMap<>();

        //Insert O(1);
        hp.put("India", 5000);
        hp.put("France", 2000);
        hp.put("UK", 1000);
        hp.put("US", 50000);

        System.out.println(hp);

        //get O(1)
        int Popuation = hp.get("UK");
        System.out.println(Popuation);

        //delete O(1)
        System.out.println(hp.remove("US"));
        System.out.println(hp);

        //IF any Key is NOt Presernt in the HashMa then it will return the null Values
        System.out.println(hp.get("Pakistan"));

        //  Compute To
        System.out.println(hp.containsKey("India"));
        System.out.println(hp.containsKey("Indonesia"));

        // Size O(n)
        System.out.println(hp.size());

        // IsEmapty
        hp.clear();
        System.out.println(hp.isEmpty());
    }
}