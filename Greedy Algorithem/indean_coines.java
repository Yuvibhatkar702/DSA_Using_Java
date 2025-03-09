import java.util.*;

public class indean_coines {
    public static void main(String args[]){

        Integer arr[] = {1,2,5,10,20,50,100,500,1000}; // number of Coins

        Arrays.sort(arr, Comparator.reverseOrder());
        ArrayList<Integer> list = new ArrayList<>();

        
        int xyz = 590;
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(xyz >= arr[i]){
                
                while (xyz >= arr[i]) {
                    xyz -= arr[i];
                    list.add(arr[i]);
                    count++;
                }
              
            }
        }

        System.out.println("Numbers of Coin Used :- " + count);

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
       // System.out.println();
    }
}
