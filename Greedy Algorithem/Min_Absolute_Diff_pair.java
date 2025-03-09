import java.util.*;

public class Min_Absolute_Diff_pair {
    public static void main(String args[]){

        int arr[] = {5,8,9,8};
        int arr2[] = {10,7,4,5};

        Arrays.sort(arr);
        Arrays.sort(arr2);

        int minDiff = 0;

        for(int i=0; i<arr.length; i++){
            minDiff = Math.abs(arr[i]-arr2[i]);
        }

        System.out.print(minDiff);
    }
}
