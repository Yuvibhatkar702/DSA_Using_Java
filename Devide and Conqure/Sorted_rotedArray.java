public class Sorted_rotedArray {

    public static int Serach(int arr[], int value, int SI, int EI){

        // Base Case
        if(SI > EI)
        {
            return -1;
        }

        int mid = SI + (EI - SI)/2; // SI+EI/2;

        // case 1
        if(arr[mid] == value){
            return mid;
        }

       
        if(arr[SI] <= arr[mid]){  // cheak only left side of the Array
            if(arr[SI] <= value && value <= arr[mid])
            {
                return Serach(arr, value, SI, mid-1);
            }
            else{ // check the Right hand side of the array
                
                return Serach(arr, value,mid+1, EI);
            }
        }    // only chage the Priortiy in both case.
        else{
            if(arr[mid+1] <= value && value <= EI){
                return Serach(arr, value, mid+1, EI);
            }
            else{
                return Serach(arr, value, SI, mid-1);
            }
        }
    }
    public static void main(String args[]){

        // This Quction Slove by using Advace Binary Serach Algorithem
        int arr[] = {4,5,6,7,0,1,2};
        int value = 0;
        int f = Serach(arr, value, 0, arr.length-1);
        System.out.print(f);
    }
}
