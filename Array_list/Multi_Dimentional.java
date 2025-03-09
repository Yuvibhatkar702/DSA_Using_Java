import java.util.ArrayList;

public class Multi_Dimentional {
    public static void main(String args[]){

        ArrayList<ArrayList<Integer>> ArrayMain = new ArrayList<>();

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(22);
        arr1.add(88);
        arr1.add(44);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(2);
        arr2.add(8);
        arr2.add(5);

        ArrayMain.add(arr1);
        ArrayMain.add(arr2);

        System.out.println(ArrayMain);

        ///for(int i=0; i<ArrayMain.size(); i++){
            //ArrayList<Integer> curr = ArrayMain.get(i);
            for(int j=0; j<ArrayMain.size(); j++)
            {
                System.out.print(ArrayMain.get(j) + " " );
            }
            System.out.println();
        
    }
}
