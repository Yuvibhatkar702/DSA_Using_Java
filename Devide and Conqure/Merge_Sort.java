class Merge_Sort{

    public static void mergeSort(int arr[],int si, int ei ){
        // Base Case
        if(si >= ei){
            return;
        }

        // Kam
        int mid = si + (ei-si) / 2; // (si+ei)/2;
        mergeSort(arr, si, mid); // rigth hand side
        mergeSort(arr, mid+1, ei); // left hand side

        //merge arrays
        mergeArray(arr,si,mid,ei);
    }

    public static void mergeArray(int arr[], int si, int mid, int ei){
        // temp array.
        int temp[] = new int[ei-si+1];

        int i = si; // rigth hand side start point
        int j = mid+1; // left hand point start point
        int te=0; // temp varibale

        while (i<=mid && j <= ei) {
            if(arr[i] < arr[j]){
                temp[te] = arr[i];
                i++;
            }else{
                temp[te] = arr[j];
                j++;
            }
            te++;

            // for remining elements

            while (i<=mid) {
                temp[te] = arr[i];
                te++; i++;                
            }

            while (j <= ei) { // here is the confusion
                temp[te] = arr[j];
                te++; i++;  
            }

            // Copy element into orignal Array

            for(int k=0, h=si; k<temp.length; k++,h++){
                arr[h] = temp[k];
            }
        }


    }
    public static void main(String args[]){

        /*
        Steps to perform by Merge Sort.
         * 1. Divide the array.
         * 2. Sort the array.
         * 3. Merge the arrays.
        */

        int arr[] = {5,4,8,2};

        mergeSort(arr, 0, arr.length-1);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}