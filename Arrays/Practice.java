public class Practice {
    public static void main(String args[]){

        int arr[] = {5,4,7,3,6,4,8,4,8,4,7};
        
        int sum = 0;
        int MAX = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){

            for(int j=i; j<arr.length; j++){

                sum = 0;
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                    // System.out.print(arr[k] + " , ");
                }

                System.out.println(sum);

                if(MAX < sum){
                    MAX = sum;
                }
            }
        }

        System.out.println("Maxmimum Value is :- "+ MAX);
           
    }

}

