import java.util.*;

public class treeTraversal {

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
    
    static class Create{
        static int index = -1;

        public static Node Tree(int arr[]){ // To create the Tree Structure // O(n)
 
            index++;  // Add root Node

            if(arr[index] == -1){ // Base Case
                return null;
            }

            Node newNode = new Node(arr[index]); // To Create Node Space / via Object

            newNode.left = Tree(arr); // To Print Left Node
            newNode.right = Tree(arr); // To Print Right Node 
 
            return newNode; // Return Root Node
         }

        public static void preOrder(Node Root){ // To Print The Three // O(n)

            if(Root == null)// Base Case
            {
                return;
            }
            System.out.print(Root.data + " "); 


            preOrder(Root.left);
            preOrder(Root.right);

        }

        public static void inOrder(Node Root){

            if(Root == null){
                return;
            }

            inOrder(Root.left);
            System.out.print(Root.data + " ");
            inOrder(Root.right);

        }

        public static void postOrder(Node Root){ // O(n)

            if(Root == null){
                return;
            }

            postOrder(Root.left);
            postOrder(Root.right);
            System.out.print(Root.data + " ");
        }

        public static void levelOrder(Node Root){

            if(Root == null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(Root);
            q.add(null); // to Inset the Next Line


            while (!q.isEmpty()) {
                Node temp = q.remove();
                if(temp == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(temp.data + " ");
                    if(temp.left != null){
                        q.add(temp.left);
                    }

                    if(temp.right != null){
                        q.add(temp.right);
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        Create c = new Create();

        Node Root = c.Tree(arr);
        
        //c.preOrder(Root);
        //c.inOrder(Root);
        //c.postOrder(Root);
        c.levelOrder(Root);
    }
}
