import java.util.*;

public class Maximum_length_chine {
    public static void main(String args[]){

        int pair[][] = {{5, 24},
                        {39,60},
                        {5, 28},
                        {27,40},
                        {50,90}
                        };

        Arrays.sort(pair, Comparator.comparingDouble(o -> o[1]));

        int chineLen = 1;
        int chineEnd = pair[0][1];

        for(int i=1; i<pair.length; i++){
            if(pair[i][0] > chineEnd){
                chineLen++;
                chineEnd = pair[i][1];
            }
        }

        System.out.println("Max length of chine = " + chineLen);
    }
}
