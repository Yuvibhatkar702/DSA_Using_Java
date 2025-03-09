import java.util.ArrayList;

public class lowest_Comman_Ansistor {

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

    public static boolean findPath(Node root, int n, ArrayList<Node> path){

        if(root == null){
            return false;
        }

        boolean foundLeft = findPath(root.left, n, path);
        boolean foundRight = findPath(root.right, n, path);

        if(foundLeft || foundRight){
            return false;
        }

        path.remove(path.size()-1);

        return false;
    }


    public static Node lca(Node root, int n1, int n2){ //Lowet Comman Ancestor

        ArrayList<Node> l1 = new ArrayList<>();
        ArrayList<Node> l2 = new ArrayList<>();

        findPath(root, n1, l1); // methode to find the Path
        findPath(root, n2, l2);


        // Last Comman Ancestor
        int i = 0;
        for(; i<l1.size() && i<l2.size(); i++){
            if(l1.get(i) != l2.get(i)){
                break;
            }
        }

        // Last equal Value 
        Node lca = l1.get(i-1);
        return lca;

    }

    public static Node Ancestor(Node root, int s1, int s2){

        if(root == null || root.data == s1 || root.data == s2 ){ // Base Case and check Root Node First
            return root;
        }

        Node check_left = Ancestor(root.left, s1, s2);
        Node check_right = Ancestor(root.right, s1, s2);
        
        if(check_right == null){
            return check_left;
        }

        if (check_left == null) {
            return check_right;
        }

        return root;
    }

    public static int lcaDist(Node root, int n1){

        if(root == null){
            return -1;
        }

        if(root.data == n1){
            return 0;
        }

        int left = lcaDist(root.left, n1);
        int right = lcaDist(root.right, n1);

        if(left == -1 && right == -1){
            return -1;
        }else if(left == -1){
            return right+1;
        }else{
            return left+1;
        }
    }
    public static int minDistance(Node root , int n1,int n2){

        Node lca = Ancestor(root, n1, n2); 

        int left = lcaDist(lca,n1);
        int righ = lcaDist(lca,n2);

        return left + righ;
    }

    public static int kth_Ansistor(Node root, int node, int k){

        if(root == null){ // Base Case
            return -1;
        }

        if(root.data == node){
            return 0;
        }

        int left = kth_Ansistor(root.left, node, k);
        int righ = kth_Ansistor(root.right, node, k);

        if(left == -1 && righ == -1){
            return -1;
        }

        int max = Math.max(left, righ);

        if(max+1 == k){
            System.out.println(root.data);
        }

        return max+1;
    }
    public static void main(String args[]){

        Node root = new Node(11);

        root.left = new Node(22);
        root.left.left = new Node(33);
        root.left.right = new Node(44);

        root.right = new Node(55);
        root.right.right = new Node(66);
        root.right.left = new Node(77);

        int n1 = 66, n2 = 77;

        // System.out.println(lca(root, n1, n2));
        System.out.println(Ancestor(root, n1, n2).data);

        System.out.println(minDistance(root, n1, n2));

        System.out.println(kth_Ansistor(root, n1, n2));
    }
}
