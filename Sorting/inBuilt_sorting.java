import java.util.Arrays;
import java.util.Collections;

public class inBuilt_sorting {
    public static void main(String args[])
    {
        int arr[] = {12,4,5,33,2,14,25,31,1,23};
        Integer array[] = {6,5,4,3,2,1,5};

        //Arrays.sort(arr);
        //Arrays.sort(arr, 0,4);
        Arrays.sort(array, Collections.reverseOrder());
        
        for(int i=0; i<array.length; i++)
        {
            System.out.print(array[i] + ", ");
        }
    }
}
