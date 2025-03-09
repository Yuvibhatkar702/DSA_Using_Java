import java.util.ArrayList;

public class Pair_sum {

    public static boolean PairSum(ArrayList<Integer> arr, int sum){ // O(n^2)
        // Brute Force
        for(int i=0; i<arr.size()-1; i++)
        {
            for(int j= i+1; j<arr.size(); j++){

                if(arr.get(i) + arr.get(j) == sum){
                   return true;
                }
            }
        }
        return false;
    }

    public static boolean PairSum_2(ArrayList<Integer> arr, int sum){ // O(n)
        
        int ls = 0;
        int rs = arr.size()-1;

        while (ls < rs) {
            
            if(arr.get(ls) + arr.get(rs) == sum){
                return true;
            }if(arr.get(ls) + arr.get(rs) < sum){
                ls++;
            }else{
                rs--;
            }
        }
        return false;
    }

    public static boolean Pair_Sum_with_Roted(ArrayList<Integer> arr2, int target){

        int Breking_point = -1;
        int n = arr2.size();

        for(int i=0; i<arr2.size(); i++){

            if(arr2.get(i) > arr2.get(i+1)){
                Breking_point = i;
                break;
            }
        }

        
        int lp = Breking_point+1;
        int rp = Breking_point;

        while (lp != rp) {
            
            //Case 1
            if(arr2.get(lp) + arr2.get(rp) == target){
                return true;
            }

            // Case 2
            if(arr2.get(lp) + arr2.get(rp) < target){
                lp = (lp+1)%n;
            }else{
                rp = (n+rp-1)%n;
            }
        }

        return false;
    }

    public static void main(String args[])
    {
        ArrayList<Integer> arr =  new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);

        //int Pair_Sum = 112;
        //System.out.println(arr);
        //System.out.println(PairSum(arr,Pair_Sum));
        //System.out.println(PairSum_2(arr, Pair_Sum));


        ArrayList<Integer> arr2 = new ArrayList<>(); // Roteded Arrray

        arr2.add(11);
        arr2.add(15);
        arr2.add(6);
        arr2.add(5);
        arr2.add(4);
        arr2.add(3);
        arr2.add(2);
        arr2.add(1);
        

        int target = 3;

        System.out.println(Pair_Sum_with_Roted(arr2, target));
    }
}
