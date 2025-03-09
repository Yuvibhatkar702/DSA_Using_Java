public class calculateTree_height {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int treeHight(Node root){

        if(root == null){
            return 0;
        }

        int Lef = treeHight(root.left);
        int righ = treeHight(root.right);

        return Math.max(Lef, righ) + 1;
    }

    public static int countNode(Node root){
        if(root == null){
            return 0;
        }

        int rig = countNode(root.left);
        int lef = countNode(root.right);

        return (rig + lef) + 1;
    }

    public static int sumNode(Node root){

        if(root == null)
        {
            return 0;
        }

        int rightSum = countNode(root.left);
        int leftSum = countNode(root.right);

        return (leftSum + rightSum) + root.data;

    }

    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);

        System.out.println(treeHight(root));

        System.out.println(countNode(root));

        System.out.println(sumNode(root));
    }
}
