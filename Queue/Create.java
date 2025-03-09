public class Create{

    static class Queue{

        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;    
        }

        // isEmpty
        public boolean isEmpty(){

            return rear == -1;
        }

        // add
        public void add(int data){

            if(rear == size-1){
                System.out.println("Stack is Full");
                return;
            }

            rear = rear + 1;
            arr[rear] = data;
            
        }

        // Remove
        public int  remove(){
            if(isEmpty()){
                System.out.println("Stack is Ematy");
                return -1;
            }

            int fount = arr[0];

            for(int i=0; i<=rear; i++){
                arr[i] = arr[i+1];
            }

            rear--;
            return fount;
        }

        // peek
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is Ematy");
                return -1;
            } 
            return arr[0];
        }


    }
    public static void main(String args[]){

        Queue q = new Queue(5);

        q.add(55);
        q.add(22);
        q.add(44);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}