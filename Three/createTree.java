// this is pre-Order Squence Three that means Visit the Root node first and then visit the left node 
// and then right Node

public class createTree{

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{

        static int index = -1;

        public static Node Create(int arr[]){
            
            index++;

            if(arr[index] == -1){
                return null;
            } 

            Node newNode = new Node(arr[index]);

            newNode.left = Create(arr);
            newNode.right = Create(arr);

            return newNode;
        }
    }
    
    public static void main(String args[]){
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
 
        BinaryTree bt = new BinaryTree();

        Node ans = bt.Create(arr);

        System.out.println(ans.data);
         
    }
}