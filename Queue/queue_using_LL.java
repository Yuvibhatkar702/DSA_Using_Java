
public class queue_using_LL {

    // Create LL
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue{

        public static Node Head;
        public static Node Tail;
        public static int Size;

        // isEmpty
        public boolean isEmaty(){
            return Head == null && Tail == null; 
        }

        //addElement
        public void add(int data){
            
            Node newNode = new Node(data);

            if(Head == null){
                Head = Tail = newNode;
                return;
            }

            Tail.next = newNode;
            Tail = newNode;
        }

        //removeElement
        public int remove(){

            if(isEmaty()){
                System.out.println("LL is Ematy");
                return -1;
            }

            int temp = Head.data;

            if(Head == Tail){
                Head = Tail = null;
            }else{
                Head = Head.next;
            }
            
            return temp;
        }

        public int peek(){
            if(isEmaty()){
                System.out.println("Queue is Ematy");
                return -1;
            }

            return Head.data; 
        }
    
    }
    public static void main(String args[]){
        Queue q = new Queue();

       q.add(11);
       q.add(22);
       q.add(33);
       q.add(44);

       while (!q.isEmaty()) {
            System.out.println(q.peek());
            q.remove();
       }

    }
}
