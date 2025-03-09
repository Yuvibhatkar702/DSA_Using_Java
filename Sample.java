

public class Sample{

    public static int Bubble(int arr[], int start,int end,int item)
    {
        while(start <= end){

            int mid = start+(end-start)/2;

            if(item == arr[mid]){
                return mid;
            }

            if(item > arr[mid])
            {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;     
    }

    // while (start <= end) {

    //         int mid = (start + end) / 2;

    //         if (num == a[mid]) {
    //             return mid;
    //         }
    //         if (a[mid] < num) {
    //             start = mid + 1;
    //         } else {
    //             end = mid - 1;
    //         }
    //     }
    //     return -1;
    // }
   public static void main(String args[])
   {
        int arr[] = {2,5,6,7,9};


        System.out.println(Bubble(arr,0,arr.length-1,9));
   }
   
}
