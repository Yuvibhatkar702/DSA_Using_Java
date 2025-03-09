import java.util.ArrayList;


public class MostWater {

    public static int Approch_1(ArrayList<Integer> arr){ // O(n^2)

        
        int MaxWater = 0;

        for(int i=0; i<arr.size()-1; i++)
        {
            for(int j=i+1; j<arr.size(); j++){
                
                int weigth = j -  i;

                int height = Math.min(arr.get(i), arr.get(j));

                int currWater = weigth * height;

                MaxWater = Math.max(MaxWater, currWater);
                

            }
        }

        return MaxWater;
    }

    public static int Approch_2(ArrayList<Integer> arr){  // O(n)

        int MaxWater = 0;
        int lp = 0;
        int rp = arr.size()-1;

        while (lp <= rp) {
            int height = Math.min(arr.get(lp), arr.get(rp));
            int weigth = rp - lp;
            int curr_Water = height * weigth;
            MaxWater = Math.max(MaxWater, curr_Water);

            // Hadling Pointers

            if(arr.get(lp) < arr.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return MaxWater;
    }


    public static void main(String args[]){

        ArrayList<Integer> arr =  new ArrayList<>();

        arr.add(1);
        arr.add(8);
        arr.add(6);
        arr.add(2);
        arr.add(5);
        arr.add(4);
        arr.add(8);
        arr.add(3);
        arr.add(7);
        
        System.out.println(Approch_2(arr));
    }
}
