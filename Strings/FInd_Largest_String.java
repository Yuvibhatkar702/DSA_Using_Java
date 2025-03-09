package Strings;

public class FInd_Largest_String {

    public static void main(String args[])
    {
        String arr[] = {"apple","mango","banana"};

        String largest = arr[0];
        
        for(int i=1; i<arr.length; i++)
        {
            if(largest.compareTo(arr[i]) < 0)
            {
                largest = arr[i];
            }
            
        }
       System.out.println(largest);
    }
}


// about the Compare to Methode

// if it will return :- 0 than String1 == String2
                    // < 0 than String1 < String2
                    // > 0 than String1 > String3
                    
// diffrent between compareTo() and comparetoIgnoreCase() 
                // in compare to 'a' == 'A';
                // in comparetoIgnoreCase 'a' != 'A';