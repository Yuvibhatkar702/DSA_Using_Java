import java.util.*;

public class activity_selection_Code{ // O(n)
    public static void main(String args[]){

        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        // Sorting 2d arrays in java 
        // int activity[][] = new int[start.length][3];
        // for(int i=0; i<start.length; i++){
        //     activity[i][0] = i;
        //     activity[i][1] = start[i];
        //     activity[i][2] = end[i]; 
        // }

        // Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));


        int maxActi = 0; // count the Numbers of Activity
        ArrayList<Integer> arr = new ArrayList<>(); // to store Activitys

        // 1st activity
        maxActi = 1; //start
        arr.add(0); //end
        int lastEnd = end[0];

        for(int i=1; i<end.length; i++)
        {
            if(start[i] >= lastEnd){
                maxActi++;
                arr.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("The count of the Activitys is :- " + maxActi);
        for(int i=0; i<arr.size(); i++){    
            System.out.print("A" + arr.get(i) + " ");
        }
    }
}