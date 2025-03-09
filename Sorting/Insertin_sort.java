public class Insertin_sort {
    public static void main(String args[])
    {
        int a[] = {5,3,2,1,2,2,4,5,2,5};
        
        for(int i=1; i<a.length; i++)
        {
            for(int j=i; j>0; j--)
            {
                if(a[j] < a[j-1])
                {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                    
                }
                else{
                    break;
                }
            }
        }

        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + ", ");  
        }
    }
}
