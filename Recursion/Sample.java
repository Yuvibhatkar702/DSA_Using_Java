package Recursion;

public class Sample {

    // public static void Table(int n){

    //     if(n <= 2){ // Base Case
    //         System.out.print(n);
    //         return;
        

    //     System.out.print(n + " ");
    //     Table(n-2);
    // }

    // public static void Numbers(int n){
        

    //      if(n == 1){
    //         System.out.print(n + " ");
    //         return; 
    //     }

    //     Numbers(n-1);
    //     System.out.print(n + " ");

    // }

    public static int Factorial(int n){

        if(n == 0){ // Base Case
            return 1;
        }

        int fac1 = Factorial(n-1);
        int fac2 = n * Factorial(n-1);
        return fac2;

}

    public static int Natural_Number(int n){

        if(n == 1){

            return 1;   
        }

        int num1 = Natural_Number(n-1);
        int num2 = n + Natural_Number(n-1);
        return num2;
    }

    public static int Fibonacci_Series(int n){

        if(n == 1 || n == 0)
        {
            return n;
        }

        int fib1 = Fibonacci_Series(n-1);
        int fib2 = Fibonacci_Series(n-2);
        return fib1 + fib2;
    }

    public static boolean Sorted(int arr[], int i)
    {
        if(i == arr.length-1) // Base Case
        {
            return true;
        }

        if(arr[i] > arr[i+1]){

            return false;
        }

        return Sorted(arr,i+1);

       
    }


    public static int Find_index(int arr[], int n, int i){

        if(i == arr.length-1) // Base case
        {
            System.out.println("Item Not Found");
        }

        if(arr[i] == n){
            return i;
        }

        return Find_index(arr,n,i+1);

    }


    public static int Find_Last_index(int arr[], int n, int i){

        if(i == arr.length){
            return -1;
        }    

        int isFound = Find_Last_index(arr, n, i-1);

        if(isFound == -1 && arr[i] == n){
            return i;
        }

        return isFound;

    }

    public static int Power(int n, int p){
        if(p == 0){
            return 1;
        }

        return n * Power(n,p-1);
    }
    public static void main(String args[]){
        /*
         *  Recursion is a methode of solving a Computational problems whare the solution depend on a solution 
            to Simmear Instance of the Same time.
         *  Whan-near we write the recursion function so we must have a Base-Case in the Function Other-wise the Function will get Crash.

        */

        // int n = 20;
        // Table(n); // 2 Table

        // int s = 10;
        // Numbers(s);

        // int f = 5;
        // System.out.println(Factorial(f));

        // int n = 6;
        // System.out.println(Natural_Number(n));

        // int fs= 23;
        // System.out.println(Fibonacci_Series(fs));

        // int arr[] = {1,2,3,55,5,6};
        // System.out.println(Sorted(arr,0));

        // int arr[] = {55,55,55};
        // System.out.println(Find_index(arr,55,arr.length-1));

        System.out.print(Power(2,10));

    }
}
