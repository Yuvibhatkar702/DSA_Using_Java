public class deleteNode {
    
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

    public static void Inorder(Node root){
        if(root == null){
            return;
        }

        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
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

    public static Node deleteNode(Node root, int val){

        if(root.data < val){
            root.right = deleteNode(root.right, val);
        }else if(root.data > val){
            root.left = deleteNode(root.left, val);
        }else{
            //Voild

            //Case 1 = Leaf Node // Last Node
            if(root.left == null && root.right == null){
                return null;
            }

            //Case 2 
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            // Case 3 = Both are chaild

            Node IS = inorderSecsesor(root.right);
            root.data = IS.data;
            root.right = deleteNode(root.right, IS.data);

        }

        return root;
    }

    public static Node inorderSecsesor(Node root){

        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printBetweenNode(Node root, int q1, int q2){ 

        if(root == null){
            return;
        }

        if(root.data >= q1 && root.data <= q2){
            printBetweenNode(root.left, q1, q2);
            System.out.print(root.data+ " ");
            printBetweenNode(root.right, q1, q2);
        }

        else if(root.data < q1){
            printBetweenNode(root.left, q1, q2);
        }else{
            printBetweenNode(root.right, q1, q2);
        }
    }
    public static void main(String args[]){

        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = Insert(root, values[i]); // We can send the values one by one
        }

        Inorder(root);
        System.out.println();

        // deleteNode(root, 3);
        // System.out.println();

        // Inorder(root);
        // System.out.println();

        printBetweenNode(root, 5, 12);

        //Inorder(root);
        System.out.println();

    }
}
