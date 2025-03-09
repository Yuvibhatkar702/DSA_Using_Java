import java.util.ArrayList;
import java.util.Scanner;

public class Min_num {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<5; i++)
        {
            System.out.println("Enter the " + i + " Value :- ");
            arr.add(i, sc.nextInt()); 
        }

        // arr.add(11);
        // arr.add(22);
        // arr.add(33);

        System.out.println(arr);

        int min = Integer.MIN_VALUE;

        for(int i=0; i<arr.size(); i++){
            
            // if(min < arr.get(i));
            // {
            //     min = arr.get(i);
            // }

            min = Math.max(min, i);
        }

        System.out.println("Minimum Values is :- " + min);
    }
}
