import java.util.*;

public class print_Nth_Row {

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void printRow(Node root, int level, int nth){  // O(n)

        if(root == null){ // Base Case
            return;
        }

        if(level == nth){
            System.out.print(root.data + " ");
            return;
        }

        printRow(root.left, level+1, nth);
        printRow(root.right, level+1, nth);
    }

    
    
            
    public static void main(String args[]){

        Node root = new Node(11);

        root.left = new Node(22);
        root.left.left = new Node(44);
        root.left.right = new Node(66);

        root.right = new Node(33);     
        root.right.right = new Node(55);      
        root.right.left = new Node(77);


        // int row = 2;
        // printRow(root, 1, row);

       
    }
}
