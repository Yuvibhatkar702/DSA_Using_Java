class Sample{

    public static void Find_element(int n){

        String digits[] = {"zero","one","two","three","four","five","six","seven","eight","night"};

        if(n == 0)
        {
            return;
        }

        int Last_index = n%10;

        Find_element(n/10);

        System.out.print(Last_index);
        //System.out.print(digits[Last_index]+ " ");
    }
    public static void main(String args[]){

        
        int key = 548;
        Find_element(key);
       
    }
}