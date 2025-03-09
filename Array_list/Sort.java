import java.util.ArrayList;
import java.util.Collections; // Class
import java.util.Collection; // Interface
public class Sort {
    public static void main(String args[])
    {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(9);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(7);

        System.out.println(arr);

        Collections.sort(arr);
        System.out.println(arr);

        Collections.sort(arr, Collections.reverseOrder());
        System.out.println(arr);

        
    }
}
