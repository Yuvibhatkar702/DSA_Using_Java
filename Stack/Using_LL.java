

public class Using_LL {

    public static class Node {
        
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack{
        
        public static Node Head;
        public static Node Next;

        // Methode 1
        public boolean isEmpty(){
            return Head == null;
        }

        public void PUSH(int data){

            Node new_node = new Node(data);

            if(isEmpty()){
                Head = new_node;
                return;
            }

            new_node.next = Head;
            Head = new_node;
        }

        public int POP()
        {
            if (isEmpty()) {
                return -1;
            }
            
            int temp = Head.data;

            Head = Head.next;
            return temp;
        }

        public int Pick(){

            if(isEmpty())
            {
                return -1;
            }

            return Head.data;
        }
        
    }
     
    
    public static void main(String args[]){

       Stack s = new Stack();

        s.PUSH(11);
        s.PUSH(22);
        s.PUSH(33);
        s.PUSH(44);
        s.PUSH(55);
        
        while (!s.isEmpty()) {  

            System.out.println(s.Pick());
            s.POP();
            
        }

        System.out.println(s.Pick());

    }
}
