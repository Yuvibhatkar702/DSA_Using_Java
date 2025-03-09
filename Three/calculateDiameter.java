public class calculateDiameter {

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
    public static int Height(Node root){

        if(root == null){
            return 0;
        }

        int left = Height(root.left);
        int right = Height(root.right);

        return Math.max(left, right) + 1;
    }

    public static int Diameter(Node root){ // O(n^2);

        if(root == null){
            return 0;
        }


        int left = Diameter(root.left);
        int lHe = Height(root.left);    // O(n);
        int right = Diameter(root.right);
        int rHe = Height(root.right);

        int daime = lHe + rHe + 1;

        return Math.max(daime, Math.max(left, right));
    }


    public static class Info{
        int daime;
        int ht;

        public Info(int d, int h){
            this.daime = d;
            this.ht = h;
        }
    }


    public static Info Diameter_2(Node root){ // O(n)

        Info left = Diameter(root.left);
        Info right = Diameter(root.right);

        int dia = Math.max(Math.max(left.daime, right.daime),left.ht + right.ht + 1);
        int ht = Math.max(left.ht, right.ht) + 1;

        return new Info(dia, ht);

    } 

    public static void main(String args[]){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);

        System.out.println(root.data);

        System.out.println(Height(root));

        System.out.println(Diameter(root));

        System.out.println(Diameter_2(root));
    
    }
}
