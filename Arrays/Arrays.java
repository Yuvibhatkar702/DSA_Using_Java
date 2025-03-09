import java.util.*;

public class Arrays {

    public static void ChageArray(int a[]) { // Call by refrance // O(log n)
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + 1;
            i++;
        } 
    }

    public static int LinearSherach(int a[], int key) { // O(n)
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void LargestValue(int a[]) { //O(n)
        int big = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (big < a[i]) {
                big = a[i];
            }

            if (small > a[i]) {
                small = a[i];
            }
        }

        System.out.println(big);
        System.out.println(small);
    }


    public static int BinarySerach(int a[], int num) { // O(log n)
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (num == a[mid]) {
                return mid;
            }
            if (a[mid] < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }


    public static void ReverseArray(int a[]) // O(log n)
    {
        int first = 0 , last = a.length-1;

        while (first < last) {
            int temp = a[last];
            a[last] = a[first];
            a[first] = temp;

            first++;
            last--;
        }

        for(int i=0; i<= a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String args[]) {
        
        int arr[] = new int[5];

        int trr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99};

        String Name[] = { "Yuvraj", "Sunny", "Akash", "Madhuri", "Gajanan" };

        int arr2[] = {11,22,33};

        Scanner sc = new Scanner(System.in);

        // Insert Values From the User and Print the Array

            // int i = 0;
            // while (i < 5) {
            // System.out.print("Enter a values :- ");
            // arr[i] = sc.nextInt();
            // i++;
            // }

            // for(int j=0; j<= 4; j++ )
            // {
            // System.out.println(arr[j]);
            // }



        
        // Add 1 in odd Numbers of the Arrays.

            //ChageArray(trr);
            // for(int i = 0; i < trr.length; i++)
            // {
            //     System.out.println(trr[i]);
            // }

        
        // LinearSherach

            // int Num = LinearSherach(trr, 99); 
            //     if(Num == -1)
            //     {
            //         System.out.println("Not Found");
            //     }else{
            //         System.out.println("Number font at Index :- " +Num);
            //     }



        // Largest Values

            //LargestValue(trr);


        // Binary Serach
            //System.out.println(BinarySerach(trr, 44));

        
        
        //reverse array 
            //ReverseArray(trr);

        
        //pires of array
            
            // int arr3[] = {11,22,33,44,55,66,77,88};
            
            // for(int i=0; i<arr3.length; i++) //  O(n^2)
            // {
            //     for(int j=i+1; j<=arr3.length; j++)
            //     {
            //         for(int k=i; k<j; k++)
            //         {
            //             System.out.print(arr3[k] + " ");
                        
            //         }
            //         System.out.println();
            //     }
            //     System.out.println();
            // }


        //find MAX values of the pares of the array 


        //     int arr4[] = {2,4,6,8,10};
        //     int sum = 0;
        //     int MAX = Integer.MIN_VALUE;
       

        //     for(int i=0; i<arr4.length; i++)
        //     {
        //         for(int j=i; j<arr4.length; j++)
        //         {
        //             sum = 0;
        //             for(int k=i; k<=j; k++)
        //             {
        //                 sum += arr4[k];
        //             }
        //             System.out.println(sum);

        //             if(MAX < sum)
        //             {
        //                 MAX = sum;
        //             }
        //         }
        //     }
        
        //     System.out.println("the maximum values :- " + MAX);
        // }

        

        // Approch 2
        
        // int arr5[] = {1,-2,6,-1,3};

        // int pre[] = new int[arr.length];

        // pre[0] = arr5[0];
        // int sum = 0;
        // int MaxSum = Integer.MIN_VALUE;

        // for(int i=1; i<arr.length; i++)
        // {
        //     pre[i] = pre[i-1] + arr5[i];
           
        // } 

        // int curentSum = Integer.MIN_VALUE;

        // for(int i=0; i<pre.length; i++)
        // {
        //     for(int j=0; j<pre.length; j++)
        //     {

        //         sum = 0;
        //         sum = i == 0 ? pre[i] : pre[j] - pre[i-1];

        //     }

        //     if(MaxSum < sum )
        //     {
        //         MaxSum = sum;
        //     }
        // }

        // System.out.println(MaxSum);




            // Kadances algorithem

        int arr6[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        int sum = 0;
        int MAX = Integer.MIN_VALUE;

        for(int i=0; i<arr6.length; i++)
        {
           sum += arr6[i];

           if(sum < 0)
           {
                sum = 0;
           }

           MAX = Math.max(sum, MAX);

          
        }
        System.out.println(MAX);



        // int arr[] = {4,2,0,6,3,2,5};

        // int left[] = new int[arr.length];
        // int right[] = new int[arr.length];

        // int totalWater = 0;
        // int trapwater = 0;

        // left[0] = arr[0];
        // for(int i=1; i<arr.length; i++)
        // {
        //     left[i] = Math.max(arr[i], left[i-1]);
        // }

        // right[right.length-1] = arr[arr.length-1];
        // for(int i=right.length-2; i>=0; i--)
        // {
        //     right[i] = Math.max(right[i+1], arr[i]);
        // }

        // for(int i=0; i<arr.length; i++)
        // {
        //     totalWater = Math.min(right[i], left[i]);
        //     trapwater += totalWater - arr[i];
        // }

        // System.out.println("The total water trap in between Bulding is :- " + trapwater);

        // for(int i=0; i<arr.length; i++) 
        // {
        //     System.out.print(arr[i] + ", ");
        // }

        // System.out.println();
        
        // for(int i=0; i<left.length; i++) 
        // {
        //     System.out.print(left[i] + ", ");
        // }

        // System.out.println();

        // for(int i=0; i<right.length; i++)
        // {
        //     System.out.print(right[i] + ", ");
        // }

        // System.out.println();

        // System.out.println("The total water trap in between Bulding is :- " + trapwater);



        // find pires in the array
    //     int arr[] = { 1, 2, 3 };

    //     for(int i=0; i<arr.length-1; i++)
    //     {
    //          for(int j=i+1; j<arr.length; j++)
    //          {
    //              if(arr[i] == arr[j])
    //              {
    //                  System.out.println(true);
    //              }
    //          }
    //     }
    //     System.out.println(false);
    //  }
    }
}

   
    
