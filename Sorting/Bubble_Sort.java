public class Bubble_Sort{
    public static void main(String args[])
    {
        int arr[] = { 4, 5, 2, 1,3};

       
        for(int i=0; i<arr.length-1; i++) // Decrement Order
        {
            for(int j=0; j<arr.length-1-i; j++)
            {
               if(arr[j] < arr[j+1])
               {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
               }
            }
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}