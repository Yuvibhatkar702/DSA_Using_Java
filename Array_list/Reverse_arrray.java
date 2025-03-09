import java.util.ArrayList;

public class Reverse_arrray {
    public static void main(String args[]){

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(11);
        arr.add(22);
        arr.add(33);
        arr.add(44);
        arr.add(55);

        for(int i=arr.size()-1; i>=0; i--){ // Time Complecity O(n)
            System.out.print(arr.get(i) + " "); 
        }
       
    }
    
}
