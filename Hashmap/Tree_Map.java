import java.util.*;

public class Tree_Map {
    public static void main(String args[])
    {
        // in treeMap We can used the data Structure is Red black Tree is a type of self Balancing Tree.
        // it will show the recorde in alpabatical Orders.

        TreeMap<String,Integer> tm = new TreeMap<>();

        tm.put("India", 10);
        tm.put("Rasia", 20);
        tm.put("Canada", 40);
        tm.put("ShriLanka", 50);

        System.out.println(tm);
        //System.out.println(tm.get("Pakistan"));
        
    }
}
