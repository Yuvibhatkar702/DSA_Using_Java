public class serachNode{

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

    public static Node Insert(Node root, int val){

        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = Insert(root.left, val);
        }else{
            root.right = Insert(root.right, val);
        }

        return root;
    }

    public static void Inorder(Node root){
        if(root == null){
            return;
        }

        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static boolean SerachNode(Node root, int key){ // O(H) == H meanse Hight of the tree

        if(root == null){
            return false;
        }

        if(key == root.data){
            return true;
        }

        if(root.data > key){
            return SerachNode(root.left, key);
        }else{
            return SerachNode(root.right, key);
        }
    }

    public static void main(String args[]){

        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = Insert(root, values[i]); // We can send the values one by one
        }

        Inorder(root);

        if(SerachNode(root, 3)){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}