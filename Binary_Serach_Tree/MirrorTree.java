public class MirrorTree {
    
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

    public static Node MirrorOfTree(Node root){

        if(root == null){
            return null;
        }

        Node leftSubTree = MirrorOfTree(root.left);
        Node rightSubTree = MirrorOfTree(root.right);

        root.left = rightSubTree;
        root.right = leftSubTree;

        return root;
    }

    public static void PreOrder(Node root){

        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    public static void main(String args[]){

        Node root = new Node(50);

        root.left = new Node(40);
        root.left.left = new Node(30);
        root.left.right = new Node(45);
        
        root.right = new Node(80);
        root.right.left = new Node(70);
        root.right.right = new Node(90);

        PreOrder(root);
        System.out.println();

        root = MirrorOfTree(root);
        System.out.println();

        PreOrder(root);

    }
}
