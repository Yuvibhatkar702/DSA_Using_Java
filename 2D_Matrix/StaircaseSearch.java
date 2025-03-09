public class StaircaseSearch {
   
    public static void StaircaseSearch(int a[][],int k)
    {
        int row = 0;
        int col = a[0].length-1; 
        
        while(true)
        {
            if(a[row][col] == k)
            {
                System.out.println("Item is Found At :- " + row + ", " + col); 
                break;
            }else if(k < a[row][col])
            {
                col--;
            }else{
                row++;
            }
        }
       
    }

    public static void StaircaseSearch_FromBottom(int a[][], int k) {
        int row = a.length - 1, col = 0;

        while (true) {
            if (a[row][col] == k) {
                System.out.print("Item Faund.." + row + ", " + col);
                break;

            } else if (k < a[row][col]) {
                row--;
            } else {
                col++;
            }

        }
    }

    public static void main(String args[])
    {
        int arr[][] = { {10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}
                    };
        int key = 33;
        StaircaseSearch(arr,key);
        StaircaseSearch_FromBottom(arr,key);
    }
}
