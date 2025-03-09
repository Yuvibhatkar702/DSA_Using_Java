

public class Practice {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Print the Link-list
    public void print_list(){
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    // to Add Elements
    public void add_Fist(int data){

        // Step 1 To Create New Space Or Object
        Node n = new Node(data);
        size++;

        // Condition
        if(head == null){
            head = tail = n;
            return;
        }

        // Step 2 Point to the Head
        n.next = head;

        // Step 3 chage the Head
        head = n;
    }

    // to Add Last
    public void add_last(int data){

        Node n = new Node(data);
        size++;

        if(head == null){
            head = tail = n;
        }

        tail.next = n;

        tail = n;
    }

    // to add Middle
    public void Add_middle(int data, int pos){

        Node n = new Node(data);
        size++;

        if(pos == 0){
            add_Fist(data);
        }

        Node temp = head;
        int i = 0;

        while (i < pos-1) {
            temp = temp.next;
            i++;
        }

        temp.next = n;
        n.next = temp.next;
        
    }

    public int Remove_first(){

        if(head == null){
            System.out.println("Link_list is Ematy");
            return Integer.MIN_VALUE;
        }else if(head == tail){
            int temp = head.data;
            head = tail = null;
            size = 0;
            return temp;
        }else{
            int temp = head.data;
            head = head.next;
            size--;
            return temp;
        }
    }

    public int Remove_last(){
        
        if(head == null){
            System.out.print("Link List is emapty");
            return Integer.MIN_VALUE;
        }else if(head == tail){
            int temp = head.data;
            head = tail = null;
            size--;
            return temp;
        }else{

            Node temp = head;
            int i = 0;

            while (i < size-2) {
                temp = temp.next;
                i++;
            }

            int val = tail.data;
            temp.next = null;
            tail = temp;
            size--;
            return val;
        }
    }

    public int Search(int key){

        Node temp = head;
        int i = 0;

        while (temp != null) {

            if(temp.data == key){
                return i;
            }else{
                temp = temp.next;
                i++;
            }
        }
        return -1;
    }

    public void Reverse(){
        Node pre = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        head = pre;
    }

    public void Remove_From_Last(int key){

        Node temp = head;
        int i = 0;
    
        while (temp != null) {
            temp = temp.next;
            i++;
        }

        int j = 1;
        Node val = head;
        int Size = i - key;

        while (j < Size) {
            val = val.next;
            j++;
        }

        val.next = val.next.next;
        return;

    }

    public boolean Palindrom(){

        Node Fast = head;
        Node Slow = head;

        while (Fast != null && Slow.next != null) {
            Fast = Fast.next;
            Slow = Slow.next.next;
        }

        Node Mid = Fast;
       

        // reverse the Secound Haf

        Node pre = null;
        Node curr = Mid;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }   
        Node Start = head;
        Node MidStart = pre;

        while (MidStart != null) {
            if(Start.data != MidStart.data){
                return false;
            }
            Start = Start.next;
            MidStart = MidStart.next;
        }
        return true;
    }

    public static void main(String args[]){

        Practice pr = new Practice();

        pr.print_list();

        pr.add_Fist(11);
        pr.add_Fist(88);
        pr.print_list();

        pr.add_last(77);
        pr.add_last(88);
        pr.print_list();

        // pr.Add_middle(55,3);
        // pr.print_list();

        // pr.Remove_first();
        // pr.print_list();
        // System.out.println(size);

        // pr.Remove_last();
        // pr.print_list();
        // System.out.println(size);

        System.out.println(pr.Search(88));
        
        pr.Reverse();
        pr.print_list();

        pr.Remove_From_Last(2);
        pr.print_list();

        System.out.println(pr.Palindrom());
    }
}
