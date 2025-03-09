public class Selection_Sort {
    public static void main(String args[])
    {
        int a[] = {4,7,5,8,2,4,3,4,8,4,22,82,2};

        for(int i=0; i<a.length-1; i++)
        {
            int minValue = i;

            for(int j=i+1; j<a.length; j++)
            {
                if(a[minValue] > a[j])
                {
                    minValue = j;
                }              
            }
            
            int temp = a[minValue];
            a[minValue] = a[i];
            a[i] = temp;
        }

        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + ", ");
        }

    }
}
