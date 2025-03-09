
public class Create{

    public static class Node{
        int data;
        Node next;

        public Node(int data){ /// Constructor
            this.data = data;
            this.next = null;
        }
    }


    
    public static Node Head; // Variables
    public static Node Tail;
    public static int Size;

    public void add_First(int data)
    {
    
        Node new_node = new Node(data); // Step 1
        Size++; 

        if(Head == null){
            Head = Tail = new_node; 
            return;
        }

        new_node.next = Head; // Step 2 // put the Adress to the Next Node // "Head" is the next Node // new_node.next is the Current Node 

        Head = new_node; // Step 3 // the Current Node is the Hade
    }

    public void add_Last(int data){

        Node new_node = new Node(data);
        Size++;

        if(Head == null){
            Head = Tail = new_node;
        }

        Tail.next = new_node;
         
        Tail = new_node;
    }

    public void Add_middle(int ind, int data){

        Node new_node = new Node(data);
        Size++;

        Node temp = Head;
        int i = 0;

        if(ind == 0){
            add_First(data);
        }

        while(i < ind-1){
            temp = temp.next;
            i++;
        }

        new_node.next = temp.next;
        temp.next = new_node;

}


    public void Print(){

        Node temp = Head;

        while(temp != null){

            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int Remove_First(){

        if(Size == 0){
            System.out.print("Link-list is Eamty");
            return Integer.MIN_VALUE;
        }else if(Size == 1){
            int val = Head.data;
            Head = Tail = null;
            Size = 0;
            return val;
        }else{
            int val = Head.data;
            Head = Head.next;
            Size--;
            return val;
        }
    }

    public int Remove_last(){

        if(Size == 0){
            System.out.println("Link List is Eamty");
            return Integer.MIN_VALUE;
        }else if(Size == 1){
            int val = Head.data;
            Head = Tail = null;
            Size = 0;
            return val;
        }else{

            Node Pointer = Head;

            for(int i=0; i<Size-2; i++){
                Pointer = Pointer.next;
            }

            int val = Tail.data;
            Pointer.next = null;
            Tail = Pointer;
            Size--; 
            return val;
        }
    }

    public int Serach(int key){

        Node temp = Head;
        int i = 0;

        while(temp != null) {
             
            if(temp.data == key){
                return i;
            }else{
                temp = temp.next;
                i++;
            }
        }

        return -1;
    } 

    public int Helper(Node Head, int key){

        if(Head == null){
            return -1;
        }// Base Case

        if(Head.data == key){
            return 0;
        }

        int indx = Helper(Head.next, key);

        if(indx == -1){
            return -1;
        }

        return indx+1;
    }

    public int Serach_Using_Recoursion(int key){
        
        return Helper(Head,key);
    }   

    public void Reverse_list(){ //hard to Understand
        Node Prev = null;
        Node Curr = Tail = Head;
        Node next;

        while (Curr != null) {
            next = Curr.next;
            Curr.next = Prev;
            Prev = Curr;
            Curr = next;
        }
        Head = Prev;
    }

    public void Remove_From_last(int key){

        int sz = 0;
        Node temp = Head;
        while (temp != null) {  // Calculate Size
            temp = temp.next;
            sz++;
        }

        if(key == sz){
            Head = Head.next;
            return;
        }

        int i = 1;             
        int pre = sz-key;
        Node previos = Head;

        while (i < pre) {
            previos = previos.next;
            i++;
        }

        previos.next = previos.next.next;
        return;

    }

    public Node Find_Mid(){ // Helper Function

        // to find Middle using Slow/fast Techniqe
        Node Slow = Head;
        Node Fast = Head;
        
        while(Slow != null && Fast.next != null) {
            Slow = Slow.next;
            Fast = Fast.next.next;
        }
        return Slow;
    }

    public boolean Find_Palindrom(){

        if(Head == null || Head.next == null){
            return true;
        }
        
        // Step 1 = Find Mid
        Node Middle = Find_Mid();   

        // Step 2 = reverse the Secound Haf
        Node Pre = null;
        Node Curr = Middle;
        Node next;

        while (Curr != null) {
            next = Curr.next;
            Curr.next = Pre;
            Pre = Curr;
            Curr = next;
        }
        Node Rigth = Pre; // Rigth Haft Head
        Node left = Head;

        // Step 3 = Check Fist and Secound Haf
        while (Rigth != null) {

            if(Rigth.data != left.data){
                return false;
            }
            Rigth = Rigth.next;
            left = left.next;
        }

        return true;
       
    }   
    
    public static void main(String args[]){

        Create link = new Create(); // Main Class Object

        // link.Head = new Node(1);
        // link.Head.next = new Node(2);

        link.Print();

        System.out.println("Add Fist Node");
        link.add_First(1);
        link.Print();

        System.out.println("Add Fist Node");
        link.add_First(2);
        link.Print();

        

        System.out.println("Add Last Node");
        link.add_Last(1);
        link.Print();

        System.out.println("Add Last Node");
        link.add_Last(2);
        link.Print();

        System.out.println("Add Add Middle Node");
        link.Add_middle(2,6);
        link.Print();

        // System.out.println("Remove Fist Node");
        // link.Remove_First();
        // link.Print();

        // System.out.println("Remove Last Node");
        // link.Remove_last();
        // link.Print();

        // System.out.println("Serach Node in Link-List");
        // System.out.println(link.Serach(6));

        // System.out.println("Search using Recoursion");
        // System.out.println(link.Serach_Using_Recoursion(10));

        // System.out.println("Reverse the List");
        // link.Reverse_list();
        // link.Print();

        // System.out.println("Delete from Left");
        // link.Remove_From_last(6);
        // link.Print();

        System.out.println(link.Find_Palindrom());
    }
}