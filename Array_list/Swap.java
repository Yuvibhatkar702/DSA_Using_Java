import java.util.ArrayList;

public class Swap {
    public static void main(String args[]){

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(2);
        arr.add(5);
        arr.add(9);
        arr.add(3);
        arr.add(6);

        int inx1 = 1;
        int inx2 = 3;

        int temp = arr.get(inx1);
        arr.set(inx1, inx2);
        arr.set(inx2, temp);
        
        System.out.println(arr + " ") ;
    }
}
