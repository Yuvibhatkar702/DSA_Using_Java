import java.util.ArrayList;

public class Create{
    public static void main(String args[]){

        // Array List can be Dynamic that meanse we can Delete of Addd Data Dynamically in the array
        // Primitive data typa can not be Store Directly.


        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<String> str = new ArrayList<>();
        ArrayList<Boolean> bol = new ArrayList<>();
        ArrayList<Float> flot = new ArrayList<>();

        // Add Element
        arr.add(11);
        arr.add(22);
        arr.add(33);
        System.out.println(arr); // O(1) Time-Complecity

        // Get Element
        int a = arr.get(0);
        int b = arr.get(2);
        System.out.println(a + "," + b); // O(1)

        // Remove Element
        arr.remove(0);
        System.out.println(arr); // O(n);

        // Set Element
        arr.set(1, 44);
        System.out.println(arr);

        // Containe
        System.out.println(arr.contains(55)); // False
        System.out.println(arr.contains(44)); // True

        // array Size
        System.out.println(arr.size());

        arr.clear();
        System.out.println(arr);
        
    
    }
}