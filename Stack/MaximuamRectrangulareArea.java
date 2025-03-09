import java.util.Stack;

public class MaximuamRectrangulareArea {

    public static void maxArea(int arr[]){

       

        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        int maxArea = 0;

        // Next Smaller Right

        Stack<Integer> s = new Stack<>();
            

        for(int i=arr.length-1; i>=0; i--){

            
            while (!s.isEmpty() && arr[s.peek()] >= arr[i] ) { // becouse of to store a index in the Stack
                s.pop();
            }

            if(s.isEmpty()){
                nsr[i] = arr.length; 
            }else{
                nsr[i] = s.peek();
            }

            s.push(i);
        }

        // Next Smaller Left

        s = new Stack<>();

        for(int i=0; i<= arr.length-1; i++){
            
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }

            s.push(i);
        }


        // current area

        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int curArea = height * width;
            maxArea = Math.max(curArea,maxArea);
        }

        System.out.println("Maxsuam  Area is :- " + maxArea);
    }
    public static void main(String args[]){
        int arr[] = {2,1,5,6,2,3}; // height of Histogram
        maxArea(arr);
    }
}
