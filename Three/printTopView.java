import java.util.*;

public class printTopView {

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


        static class Intro {
            Node node;
            int hd;

            public Intro(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        
        public static void topView(Node root){

            Queue<Intro> q = new LinkedList<>();
            HashMap<Integer, Node> map = new HashMap<>();
            
            int min = 0;
            int max = 0;

            q.add(new Intro(root, 0));
            q.add(null); // for Next line

            while (!q.isEmpty()) {

                Intro curr = q.remove();

                if(curr == null)
                {
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{

                    if(!map.containsKey(curr.hd)){ // First time my Horizontal Dimantion occure
                        map.put(curr.hd, curr.node);
                    }

                    if(!map.node.left != null){
                        q.add(new Intro(curr.node.left, curr.hd-1));
                        min = Math.min(min, curr.hd-1);
                    }

                    if(!map.node.right != null){
                        q.add(new Intro(curr.node.right, curr.hd+1));
                        max = Math.max(max, curr.hd+1);
                    }
                }               
            }

            for(int i=min; i<=max; i++){
                System.out.println(map.get(i).data + " ");
            }
            System.out.println();

        }
    

    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);

        System.out.println(root.data);
    }
}
