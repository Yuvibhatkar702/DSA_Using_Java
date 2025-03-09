

public class Copy_C{

    public static void main(String args[])
    {
        Sample st = new Sample("Red",(float)32.2, "Yuvi");
        st.arr[0] = 11;
        st.arr[1] = 22;
        st.arr[2] = 33;


       Sample s2 = new Sample(st);
       s2.pass = "Sunny";
       s2.arr[1] = 66;

       for(int i=0; i<3; i++){
        System.out.println(st.arr[i]);
       }
    }
}

/*
    We can not Decleare Discructor in java Becounse java have a "Garbej Collector" They can Scan the Code, And if it is any Object are not Used in the Program then it can remove the object Actomatically.
*/

class Sample{

    String color;
    float size;
    String pass;
    int arr[];

    Sample(String cl, float size, String p){    // Constructor

        this.color = cl;
        this.size = size;
        this.pass = p;
       

        arr = new int[3];

        //System.out.println(pass);
    }

    // Copy Constructor
    Sample(Sample s1){

        arr = new int[3];
        this.color = s1.color;
        this.size = s1.size;
        //this.arr = s1.arr;
        for(int i=0; i<3; i++) // deep copy
        {
            arr[i] = s1.arr[i]; 
        }
        
        

        //System.out.println(pass);

    }
    
}
