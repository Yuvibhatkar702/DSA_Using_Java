package 2D_Matrix;

public class Diagonal_Sum{

    public static void Diagonal_Sum(int a[][])
    {
        // int Primary = 0;
        // int Secoundry = 0;
                                                // With Complexcity Big(O^2)
        // for(int i=0; i<a.length; i++){
        //     for(int j=0; j<a[0].length; j++)
        //     {
        //         if(i == j)
        //         {
        //             Primary += a[i][j];
        //         }

        //         if( i + j == a.length-1)
        //         {
        //             Secoundry += a[i][j];
        //         }              
        //     }
        // }

        // System.out.println("The Primary sum is :- " + Primary);
        // System.out.println("The Secoundry sum is :- " + Secoundry);

        // if(Primary == Secoundry)
        // {
        //     System.out.println("This is A Propar Digonals");
        // }

            int sum =0;

            for(int i=0; i<a.length; i++)
            {
                sum += a[i][i];

               if(i != a.length-1-i)
                sum += a[i][a.length-i-1];
            }

            System.out.println(sum);
    }
    public static void main(String args[])
    {
        int arr[][] = {
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
                      };

                      Diagonal_Sum(arr);
    }
    
}
