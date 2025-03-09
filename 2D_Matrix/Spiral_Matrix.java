
class Spireal_Matrix{
    
    public static void SpirealMatrix(int arr[][])
    {
        int FirstRow = 0;
        int FirstCol = 0;
        int lastRow = arr.length-1;
        int lastCol = arr[0].length-1; 

        while (FirstRow <= lastRow && FirstCol <= lastCol) {
            
          for(int i=FirstCol; i<=lastCol; i++)
          {
                System.out.print(arr[FirstRow][i] + ", ");
          }

          for(int j=FirstRow+1; j<=lastRow; j++)
          {
            System.out.print(arr[j][lastCol] + ", ");
          }

          for(int i=lastCol-1; i>=FirstCol; i--)
          {
            System.out.print(arr[lastRow][i] + ", ");
          }

          for(int j=lastRow-1; j>=FirstRow+1; j--){
            System.out.print(arr[j][FirstCol] + ", ");
          }

          FirstCol++;
          FirstRow++;
          lastCol--;
          lastRow--;
            
        }
    }
    public static void main(String args[])
    {
        int arr[][] = {
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
                      };

        SpirealMatrix(arr);
    
    }

}
