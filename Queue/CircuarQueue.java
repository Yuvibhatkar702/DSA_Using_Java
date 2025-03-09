public class CircuarQueue {

    static class Queue{

        static int arr[];
        static int rear;
        static int size;
        static int font;

        public Queue(int data){
            arr = new int[data];
            size = data;
            rear = -1;
            font = -1;
        }

        // isEmaty
        public boolean isEmaty(){
            return (rear + 1) % size == font;
        }

        // addElement
        public void add(int data){
            if(isEmaty()){
                System.out.println("Queue is Full");
                return;
            }

            if(font == -1){
                font = (font +1) % size;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // removeElement

        public int remove(){

            if(isEmaty()){
                System.out.println("Queue is Ematy");
                return -1;
            }

            int temp = arr[font];

            if(font == rear){
                font = rear = -1;
            }else{
                font = (font + 1) % size; 
            }

            return temp;
        }

        // peekElement

        public int peek(){
            if(isEmaty()){
                System.out.println("Queue is Ematy");
                return -1;
            }
            return arr[font];
        }


    }
    public static void main(String args[]){

        Queue q = new Queue(5); // Declerre array size

        q.add(11);
        q.add(22);
        q.add(33);

        while (!q.isEmaty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
