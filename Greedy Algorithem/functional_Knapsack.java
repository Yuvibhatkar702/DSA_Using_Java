import java.util.Arrays;
import java.util.Comparator;

public class functional_Knapsack{ // The Example is not Completed.... please Whach the Video Again and Solve the 
                                            // Problem Again
    public static void main(String args[]){
        int val[] = {60,100,120};
        int weigth[] = {10,20,30};
        int w = 50;

        double ratio[][] = new double[val.length][3];
        
        for(int i=0; i<val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weigth[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int finalValue = 0;

        for(int i=ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if()
        }
    }
}