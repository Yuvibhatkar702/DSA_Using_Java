public class transfrom_sum_tree {

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

    public static int sum_Node(Node root){

        if(root == null){
            return 0;
        }

        int left = sum_Node(root.left);
        int right = sum_Node(root.right);

        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = newLeft + left + newRight + right;

        return data;
    }

    public static void printTree(Node root){

        if(root == null)
        {
            return;
        }

        System.out.print(root.data + " ");
        printTree(root.left);
        printTree(root.right);
    }

   
    public static void main(String args[]){

        Node root = new Node(11);

        root.left = new Node(22);
        root.left.left = new Node(33);
        root.left.right = new Node(44);

        root.right = new Node(55);
        root.right.right = new Node(66);
        root.right.left = new Node(77);

        //System.out.println(root.data);

        // sum_Node(root);
        // printTree(root);

        if(check(root, 44)){
            System.out.println("YES");
        }else{
            System.out.println(false);
        }
    }
}
