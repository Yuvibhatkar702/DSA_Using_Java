import javax.swing.plaf.InsetsUIResource;

public class valid_BST {
    
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

    public static Node Insert(Node root, int data){

        if(root == null){
            root = new Node(data);
            return root;
        }

        if(root.data  > data){
            root.left = Insert(root.left,data);
        }

        if(root.data < data){
            root.right = Insert(root.right, data);
        }

        return root;
    }

    public static void InOrder(Node root){

        if(root == null){
            return;
        }

        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }

    public static boolean isValid(Node root, Node min, Node max){

        if(root == null){
            return true;
        }

        if(min != null && root.data <= min.data){
            return false;
        }

        if(max != null && root.data >= max.data){
            return false;
        }

        return isValid(root.left, min, root) && isValid(root.right, root, max);
    }

    
    
    public static void main(String args[]){

        int arr[] = {8,5,3,6,10,11,14};
        Node root = null;

        for(int i=0; i<arr.length; i++){
            root = Insert(root, arr[i]);
        }

        InOrder(root);

        if(isValid(root, null, null)){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
