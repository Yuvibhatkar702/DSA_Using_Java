// write a program on backTracking to print the array using Recurtion and then Dicrement the values of the array using BackTracking 

class Array{

    public static void changeArray(int arr[], int inx, int val){

        if(inx == arr.length){
            printArray(arr);
            return;
        } // Base Case

        arr[inx] = val;
        changeArray(arr, inx+1, val+1);
        arr[inx] = arr[inx] - 2;
    }

    public static void printArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArray(arr,0,1);
        printArray(arr);
    }
}